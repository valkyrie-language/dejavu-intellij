package dejavu.language.file

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.model.psi.PsiSymbolDeclaration
import com.intellij.model.psi.PsiSymbolReference
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiNameIdentifierOwner
import dejavu.language.DejavuLanguage
import dejavu.psi.node.DejavuIdentifierNode


/**
ValkyrieFile 是个 PsiElement
 */
@Suppress("UnstableApiUsage")
class DejavuFileNode(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, DejavuLanguage) {
    override fun getFileType(): FileType = DejavuFileType

    override fun toString(): String = yggdrasil.language.YggdrasilBundle.message("action.create_file")

    private val definitions = FileCache(this)


    override fun getOwnDeclarations(): MutableCollection<out PsiSymbolDeclaration> {
//        val output = mutableListOf<PsiSymbolDeclaration>()
//        for (child in this.children) {
//            output.addAll(child.ownDeclarations)
//        }
//        return output
        return mutableListOf()
    }

    override fun getOwnReferences(): MutableCollection<out PsiSymbolReference> {
//        val output = mutableListOf<PsiSymbolReference>()
//        for (child in this.children) {
//            output.addAll(child.ownReferences)
//        }
//        return output
        return mutableListOf()
    }

    fun isIndexFile(): Boolean {
        return this.name == "index.ygg"
    }
}

private class FileCache(val root: DejavuFileNode) {
    private fun getCache(): MutableMap<String, PsiNameIdentifierOwner> {
        val cache = mutableMapOf<String, PsiNameIdentifierOwner>()

//        for (child in root.children) {
//            when (child) {
//                is YggdrasilClassNode -> {
//                    cache[child.name] = child
//                }
//
//                is YggdrasilDefineUnionNode -> {
//                    cache[child.name] = child
//                }
//
//                is YggdrasilGroupNode -> {
//                    for (item in child.tokenList) {
//                        cache[item.name] = item
//                    }
//                }
//            }
//        }
        return cache
    }

    fun getCompletions(): MutableList<LookupElement> {
        val completions = mutableListOf<LookupElement>()
//        for (child in root.children) {
//            when (child) {
//                is YggdrasilClassNode -> {
//                    child.createLookup(completions)
//                }
//
//                is YggdrasilDefineUnion -> {
//                    child.createLookup(completions)
//                }
//
//                is YggdrasilGroupNode -> {
//                    for (item in child.tokenList) {
//                        item.createLookup(completions)
//                    }
//                }
//            }
//        }
        return completions
    }


    fun find(name: DejavuIdentifierNode?): PsiNameIdentifierOwner? {
        return getCache()[name?.text]
    }
}