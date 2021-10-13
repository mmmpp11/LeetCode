package dp.code63

class Kotlin63 {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val n = obstacleGrid.size
        val m = obstacleGrid[0].size
        val array = Array(n){
            IntArray(m)
        }
        for (i in array.indices){
            for (j in array[i].indices){
                if (obstacleGrid[i][j] == 1) {
                    array[i][j] = 0
                } else if (i == 0 && j == 0) {
                    array[i][j] = 1
                } else if (i == 0 && j > 0) {
                    array[i][j] = array[i][j - 1]
                } else if (j == 0 && i > 0) {
                    array[i][j] = array[i - 1][j]
                } else {
                    array[i][j] = array[i - 1][j] + array[i][j - 1]
                }
            }
        }
        return array[n-1][m-1]
    }
}