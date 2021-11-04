package string.code125;


/**
 * 125. 验证回文串
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 解题思路： 双指针  先将字符串转换成小写的方便进行判断。 再进行遍历进行比较
 */

public class Java125 {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        char[] array = a.toCharArray();
        int i = 0;
        int j = array.length-1;
        while (i < j){
            while ((array[i] -'0' < 0 || array[i] - '0' > 9) && (array[i] - 'a' < 0 || array[i] - 'a' > 26)){
                if (i < array.length-1){
                    i++;
                }
            }
            while ((array[j] -'0' < 0 || array[j] - '0' > 9) && (array[j] - 'a' < 0 || array[j] - 'a' >= 26)){
                if (j > 0 ){
                    j--;
                }
            }
            if (i < j){
                if (array[i] != array[j]){
                    return false;
                }else{
                    i++;
                    j--;
                }
            }else {
                break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Java125().isPalindrome("Marge, let's \"[went].\" I await {news} telegram.");
    }
}
