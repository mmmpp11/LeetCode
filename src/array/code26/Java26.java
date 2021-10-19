package array.code26;

/**
 * 26. 删除有序数组中的重复项
 *
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解题思路：双指针
 * 可以设置i,j 快慢指针 通过j遍历 1..m-1 当nums[i] == nums[j]时 继续前进 直到 不相同时
 * 将j的值付给i后 i++ j继续前进。
 *
 */

public class Java26 {
    public int removeDuplicates(int[] nums) {
        int m = nums.length;
        if (m == 0){
            return 0;
        }
        int i = 0;
        int j = 0;
        while (j < m){
            if (nums[i] == nums[j]){
                j++;
            }else {
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;

    }
}
