package array.code26

class Kotlin26 {
    fun removeDuplicates(nums: IntArray): Int {

        val m = nums.size
        if (m == 0){
            return 0
        }

        var i = 0
        var j = 1
        while (j < m){
            if (nums[i] == nums[j]) {
                j++
            }else{
                i++
                nums[i] = nums[j]
            }
        }
        return i+1
    }
}