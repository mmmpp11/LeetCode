package array.code169;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. 多数元素
 *
 *
 * 解题思路：hashmap
 */

public class Java169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = 0;
        int ans = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > max){
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
