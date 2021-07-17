package kotlin_exercise

class Exercise53 {
    fun maxSubArray(nums: IntArray): Int {
        var ans = nums[0]
        val f = IntArray(nums.size)
        f[0] = nums[0]
        for (i in 1 until  nums.size){
            f[i] = Math.max(f[i-1]+nums[i],nums[i])
            ans = Math.max(f[i],ans)
        }
        return ans
    }
}