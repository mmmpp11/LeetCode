package dp.code64

import kotlin.math.min

class Kotlin64 {
    fun minPathSum(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val array = Array(m){
            IntArray(n)
        }
        for (i in grid.indices){
            for (j in grid[i].indices){
                if (i == 0 && j ==0) {
                    array[i][j] = 0
                }else if (i == 0 && j > 0){
                    array[i][j] = array[i][j-1]
                }else if (j == 0 && i > 0){
                    array[i][j] = array[i-1][j]
                }else{
                    array[i][j] = min(array[i][j-1],array[i-1][j])
                }
                array[i][j] += grid[i][j]
            }
        }
        return array[m-1][n-1]
    }
}