package array.code136;


/**
 * 136. 只出现一次的数字
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *  解题思路：异或。对于任何数x ,都有x^x=0,x^0=x
 *  由于本题每个数的个数为2或1 异或遍历一圈剩下的那个就是只有一个的数。
 */

public class Java136 {
    public int singleNumber(int[] nums) {

        int sum = 0;
        for(int i : nums){
            sum ^= i;
        }
        return sum;
    }
}
