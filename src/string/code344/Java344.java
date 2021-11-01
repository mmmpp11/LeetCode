package string.code344;

/**
 * 344. 反转字符串
 *
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解题思路：双指针，一个指向0，一个指向n-1
 */

public class Java344 {
    public void reverseString(char[] s) {

        int n = s.length - 1;
        int i = 0;
        char temp;
        while (i < n){
            temp = s[n];
            s[n] = s[i];
            s[i] = temp;
            i++;
            n--;
        }
    }
}
