package dp.code62

class Kotlin62 {
    fun uniquePaths(m: Int, n: Int): Int {

        val array = Array(m){
            IntArray(n)
        }
        for (i in array.indices){
            for (j in array[i].indices){
                if (i == 0 && j == 0){
                    array[i][j] = 1
                }else if (i == 0 && j > 0){
                    array[i][j] = array[i][j-1]
                }else if (j == 0 && i > 0){
                    array[i][j] = array[i-1][j]
                }else{
                    array[i][j] = array[i-1][j] + array[i][j-1]
                }
            }
        }
        return array[m-1][n-1]
    }
}