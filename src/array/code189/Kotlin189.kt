package array.code189

/**
 * 189. 旋转数组
 *
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 *
 * 解题思路：根据题意，我们知道第i个元素最终会到第(i+k)%m的位置，
 * 第(i+k)%m个元素最终会到第((i+k)%m+k)%m的位置，等等，但也有特殊情况，
 * 可能i再次回到i时，后面还有元素没有移动，这时就要将i+1.通过一个实例我们知道，
 * 最终移动的步数是m个，每次移动元素都要使j+1直至它到m
 */

class Kotlin189 {
    fun rotate(nums: IntArray, k: Int): Unit {
        val m = nums.size
        val n = k % nums.size
        var temp = 0
        var temp1 = 0
        var i = 0
        var j = 0
        while (j < m) {
            val x = i
            temp = nums[i]
            do {
                temp1 = nums[(i + k) % m]
                nums[(i + k) % m] = temp
                temp = temp1
                i = (i + k) % m
                j++
            } while (x != i)
            i++
        }


    }
}

fun main() {
    Kotlin189().rotate(intArrayOf(-1, 100, 3, 99), 2)
}

