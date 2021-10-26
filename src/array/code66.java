package array;

import java.util.Arrays;

/**
 * 66. 加一
 *
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 *  解题思路： 此题只有两种情况：1.结尾不为0，那直接+1就完事了 2.结尾为9,那就需要知道结尾有几个连续的9，根据digits[n] == 10进行判断
 *  当n == 0 时，说明全为9，当前数组全为0，所以只需创建一个新数组，大小为digits.length+1，将0号位赋值为1即可
 */

public class code66 {
    public int[] plusOne(int[] digits) {

        int n = digits.length - 1;
        digits[n] += 1;
        while (digits[n] == 10){
            digits[n] = 0;
            if (n == 0){
                digits =new int[digits.length + 1];
                digits[0] = 1;
            }else {
                digits[n-1] += 1;
                n--;
            }
        }
        return digits;
    }
}
