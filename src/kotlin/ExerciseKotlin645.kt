package kotlin

/**
 * 645. 错误的集合
 */

class ExerciseKotlin645 {

    fun findErrorNums(nums: IntArray): IntArray {
        val ans = IntArray(2)
        var sum = 0
        for (i in 1..nums.size){
            sum += i
        }
        val map = mutableMapOf<Int, Int>()
        for (i in 0..nums.size-1){
            map[nums[i]] = map.getOrDefault(nums[i],0) + 1
        }
        for (i in map){
            if (i.value == 2){
                ans[0] = i.key
            }
            sum -= i.key
        }
        ans[1] = sum
        return ans
    }
}

fun main() {
    println(ExerciseKotlin645().findErrorNums(intArrayOf(3, 2, 2)))
}