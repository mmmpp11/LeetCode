package java_exericse;


/**
 * 704. 二分查找
 */

public class Exercise704 {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int mid = ((left+right)/2);
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        if (nums[left] == target){
            return left;
        }else {
            return -1;
        }
    }
}
