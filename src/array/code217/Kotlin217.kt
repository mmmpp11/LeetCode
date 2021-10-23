package array.code217

class Kotlin217 {
    fun containsDuplicate(nums: IntArray): Boolean {

        var result = false
        val map = HashMap<Int,Int>()
        for (i in nums){
            map[i] = map.getOrDefault(i,0) + 1
        }

        for (i in map){
            if (i.value > 1){
                result = true
            }
        }
        return result
    }
}