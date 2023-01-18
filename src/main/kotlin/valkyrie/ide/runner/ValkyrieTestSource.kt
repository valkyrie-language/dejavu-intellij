package valkyrie.ide.runner

import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.TestSourcesFilter
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.openapi.vfs.findPsiFile
import valkyrie.language.file.NexusFileNode
import valkyrie.language.file.NexusFileType

class ValkyrieTestSource : TestSourcesFilter() {
    override fun isTestSource(file: VirtualFile, project: Project): Boolean {
        if (file.fileType != NexusFileType) return false
        val root = file.findPsiFile(project) as? NexusFileNode;
        return root?.namespace?.isTestFile() ?: false
    }
}