package yggdrasil.language.file

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.psi.PsiNameIdentifierOwner
import dejavu.language.file.DejavuFileNode
import dejavu.psi.node.DejavuIdentifierNode

class YggdrasilFileCache(val root: DejavuFileNode) {
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