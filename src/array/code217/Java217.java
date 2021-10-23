package array.code217;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * 217. 存在重复元素
 *
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 * 解题思路：两种解法：
 * （1）：可以通过Arrays.sort()，将整个数组进行升序排序，通过双指针i，j 进行判断，如果nums[i] == nums[j] 则
 *          结束循环直接返回true,不然就使 i=j,j++ 一直向下找
 *  （2）： 通过hashmap来存储每个值和对应的个数，通过循环遍历来确定是否有个数大于1
 */
public class Java217 {
    public boolean containsDuplicate(int[] nums) {

//        Arrays.sort(nums);
//        int i = 0;
//        int j = 1;
//        boolean result = false;
//        while (!result && j <= nums.length-1){
//            if (nums[i] == nums[j]){
//                result = true;
//            }else {
//                i = j;
//                j++;
//            }
//        }
//        return result;

        boolean result = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > 1){
                result = true;
                break;
            }
        }
        return result;
    }
}
