package string.code7;

import java.util.List;

/**
 * 7. 整数反转
 *
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解题思路：通过将x%10来得到最后一位，在*10翻转
 * 注意：由于int的范围是[-2^31,2^31-1]，翻转后会出现溢出的情况，（-2147483648,2147483647）
 * 我们可以在处理最后一位的时候进行判断，如果ans>214748364 或者 最后一位大于7则溢出，负数则相反。
 */

public class Java7 {
    public int reverse(int x) {
//
//        if (x == 0){
//            return 0;
//        }
//        boolean a = false;
//        double temp = x;
//        StringBuilder builder = new StringBuilder();
//        if (temp < 0){
//            a = true;
//            temp = -temp;
//        }
//        while ((int)temp > 0){
//
//            int i = (int) (temp % 10);
//            builder.append(i);
//
//            temp /= 10;
//        }
//        double ans = Double.parseDouble(builder.toString());
//        if (ans >= -Math.pow(2,31) && ans <= Math.pow(2,31)-1){
//            if (a){
//                return (int)-ans;
//            }else {
//                return (int)ans;
//            }
//        }else {
//            return 0;
//        }
        int ans = 0;
        while (x != 0){
            int temp = x % 10;
            if (ans > 214748364 || (ans == 214748364 && temp > 7)){
                return 0;
            }
            if (ans < -214748364 || (ans == -214748364 && temp < -8)){
                return 0;
            }
            ans = ans * 10 + temp;
            x /= 10;
        }
        return ans;

    }

    public static void main(String[] args) {
        new Java7().reverse(123);
    }
}
