package string.code14;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 解题思路：先通过遍历找到长度最小的字符串和index
 * 将这个字符串与剩余字符串进行匹配，如果有不匹配就将字符串的长度减一继续匹配，
 * 直至字符串为“”
 */

public class Java14 {
    public String longestCommonPrefix(String[] strs) {

        int index = 0;
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++){
            if (strs[i].length() < length){
                length = strs[i].length();
                index = i;
            }
        }

        String s = strs[index];
        for (int i = 0; i < length; i++){
            String temp = s.substring(0,s.length() - i);
            boolean result = true;
            for (String str : strs){
                if (!str.substring(0,temp.length()).equals(temp)){
                    result = false;
                    break;
                }
            }
            if (result){
                return temp;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        new Java14().longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }
}
