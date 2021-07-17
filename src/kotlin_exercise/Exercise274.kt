package kotlin_exercise


/**
 *274. H 指数
 */

class Exercise274{

    fun hIndex(citations: IntArray): Int {
        citations.sort()
        var ans = 0
        for (i in citations.size-1 downTo 0){
            if (citations[i] >= citations.size - i){
                ans = citations.size - i;
            }
        }
        return ans
    }
}