package dp.code1289

class Kotlin1289 {

    fun minFallingPathSum(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        for (i in 1 until m){
            for (j in 0 until n){
                var min = Int.MAX_VALUE
                for (q in 0 until n){
                    if (j != q){
                        min = Math.min(min,grid[i-1][q])
                    }
                }
                grid[i][j] += min
            }
        }
        var min = Int.MAX_VALUE
        for (i in 0 until n){
            min = Math.min(min,grid[m-1][i])
        }
        return min
    }
}