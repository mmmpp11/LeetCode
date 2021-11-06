package string.code28;

/**
 * 28. 实现 strStr()
 *
 * 实现 strStr() 函数。
 *
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解题思路： 遍历haystack的每个值，从选择的值开始与needle开始对比，如果匹配不上就下一个
 */

public class Java28 {
    public int strStr(String haystack, String needle) {
//        if (needle.isEmpty()){
//            return 0;
//        }
//        if (haystack.isEmpty() || haystack.length() < needle.length()){
//            return -1;
//        }
//        char[] array1 = haystack.toCharArray();
//        char[] array2 = needle.toCharArray();
//        int ans = -1;
//        int j = 0;
//        int temp = 0;
//        for (int i = 0; i < array1.length; i++){
//            temp = i;
//            while (temp < array1.length){
//                if (j < array2.length &&array1[temp] == array2[j]){
//                    if (j == 0){
//                        ans = temp;
//                    }
//                    temp++;
//                    j++;
//                }else {
//                    j = 0;
//                    break;
//                }
//                if (j == array2.length){
//                    return ans;
//                }
//            }
//            ans = -1;
//        }
//        return ans;
        char[] array1 = haystack.toCharArray();
        char[] array2 = needle.toCharArray();
        int m = array1.length;
        int n = array2.length;
        boolean flag;
        for (int i = 0; i + n <=  m; i++){
            flag = true;
            for (int j = 0; j < n; j++){
                if (array1[i + j] != array2[j]){
                    flag = false;
                    break;
                }
            }
            if (flag){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        new Java28().strStr("a",
                "a");
    }
}
