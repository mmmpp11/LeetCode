package java_exericse;


/**
 *35. 搜索插入位置
 */

public class Exercise35 {
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int mid = (right-left)/2+left;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        if (nums.length == 1){
            return nums[0] >= target ? 0:1;
        }else {
            return nums[left] >= target ? left:left+1;
        }
    }
}
