package kotlin

import java.lang.StringBuilder


/**
 * 168. Excel表列名称
 */
class ExerciseKotlin168 {

    private val str = StringBuilder()

    fun convertToTitle(columnNumber: Int): String {
        dfs(columnNumber)
        return str.reverse().toString()

    }

    private fun dfs(num: Int){
        if (num == 0){
            return
        }
        val temp = num-1
        str.append('A' + temp % 26)
        dfs(temp / 26)
    }

}

