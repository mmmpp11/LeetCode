package array.code283;

import java.util.Arrays;

/**
 * 283. 移动零
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 *  解题思路： 双指针，i用来遍历整个数组中不为0的数，j用来指向当前不为0的个数。遍历一遍后，j后面的数
 *  就应该都是0
 */

public class Java283 {

    public void moveZeroes(int[] nums) {
//        if (nums.length == 1){
//            return;
//        }
//        int i = 0;
//        int j = 0;
//        int temp;
//        while (j < nums.length && i < nums.length){
//
//            if (nums[i] == 0 && nums[j] != 0){
//                if (j > i){
//                    temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }else{
//                    j = i;
//                }
//            }
//            if (nums[j] == 0){
//                j++;
//            }
//            if (nums[i] != 0){
//                i++;
//            }
//        }
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
