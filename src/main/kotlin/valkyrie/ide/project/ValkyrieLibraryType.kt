package valkyrie.ide.project.`package`

import dejavu.language.file.DejavuIconProvider
import javax.swing.Icon

enum class ValkyrieLibraryType {
    Core, LIBRARY, NAMESPACE;

    fun getIcon(): Icon {
        return when (this) {
            Core -> DejavuIconProvider.Instance.Valkyrie
            LIBRARY -> DejavuIconProvider.Instance.NAMESPACE
            NAMESPACE -> DejavuIconProvider.Instance.NAMESPACE
        }
    }
}

