package kotlin

import java.lang.StringBuilder
import java.util.*

/**
 * 剑指 Offer 37. 序列化二叉树
 */
class ExerciseKotlin297 {

    private val str = StringBuilder()

    inner class TreeNode(val _val: Int){
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun serialize(root: TreeNode?): String {
        if (root == null){
            return "null"
        }
        return str.toString()
    }

    private fun dfs(root: TreeNode?){
        if (root == null){
            str.append("null,")
            return
        }
        str.append("${root._val},")
        dfs(root.left)
        dfs(root.right)
    }

    fun deserialize(data: String): TreeNode? {
        val array = data.split(",")
        val list = LinkedList<String>(array.toList())
        return dfs2(list)

    }

    private fun dfs2(list: LinkedList<String>): TreeNode?{
        if (list[0] == "null"){
            list.removeAt(0)
            return null
        }
        val root = TreeNode(list[0].toInt())
        list.removeAt(0)
        root.left = dfs2(list)
        return root
    }



}