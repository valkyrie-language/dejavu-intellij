package valkyrie.ide.completion

import com.intellij.lang.ImportOptimizer
import com.intellij.psi.PsiFile
import dejavu.language.file.DejavuFileNode

class ValkyrieImportOptimizer : ImportOptimizer {
    override fun supports(file: PsiFile): Boolean {
        return file is DejavuFileNode
    }

    override fun processFile(file: PsiFile): Runnable {
        return Runnable { }
    }
}