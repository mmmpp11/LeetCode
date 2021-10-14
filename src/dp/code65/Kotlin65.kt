package dp.code65

class Kotlin65 {
    fun minimumTotal(triangle: List<List<Int>>): Int {
        val m = triangle.size;
        val n = triangle[m-1].size
        var min = Int.MAX_VALUE
        val array = Array(m){
            IntArray(n)
        }
        for (i in array.indices){
            for (j in 0..i){
                if (i == 0 && j == 0) {
                    array[i][j] = 0
                } else if (j == 0 && i > 0) {
                    array[i][j] = array[i - 1][j]
                } else if (j == i) {
                    array[i][j] = array[i - 1][j - 1]
                } else {
                    array[i][j] = Math.min(array[i - 1][j], array[i - 1][j - 1])
                }
                array[i][j] += triangle[i][j]
                if (i == m-1 && min > array[i][j]){
                    min = array[i][j]
                }
            }
        }
        return min
    }
}