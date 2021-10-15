package dp.code931

class Kotlin931{
    fun minFallingPathSum(matrix: Array<IntArray>): Int {

        val m = matrix.size
        val n = matrix[0].size
        var min = Int.MAX_VALUE
        if (m > 1){
            for (i in 1 until m){
                for (j in 0 until n){
                    when(j){
                        0 -> matrix[i][j] += Math.min(matrix[i-1][j],matrix[i-1][j+1])
                        n-1 -> matrix[i][j] += Math.min(matrix[i-1][j],matrix[i-1][j-1])
                        else -> matrix[i][j] += Math.min(Math.min(matrix[i-1][j-1],matrix[i-1][j]),matrix[i-1][j+1])
                    }
                }
            }
        }
        for (i in 0 until n){
            if (min > matrix[m-1][i]){
                min = matrix[m-1][i]
            }
        }
        return min
    }
}