package string.code38;

import string.code28.Java28;

/**
 * 38. 外观数列
 *
 * 给定一个正整数 n ，输出外观数列的第 n 项。
 *
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 *
 * 你可以将其视作是由递归公式定义的数字字符串序列：
 *
 * countAndSay(1) = "1"
 * countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-and-say
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 */
public class Java38 {
    public String countAndSay(int n) {
        String s = " ";
        for (int i = 0; i < n; i++){
            char[] array = s.toCharArray();
            char temp = array[0];
            StringBuilder builder = new StringBuilder();
            int num = 0;
            for (int j = 0; j < array.length; j++){
                if (temp == array[j]){
                    num++;
                }else {
                    builder.append(num);
                    if (temp != ' '){
                        builder.append(temp);
                    }
                    temp = array[j];
                    num = 1;
                }
                if (j == array.length - 1){
                    builder.append(num);
                    if (temp != ' '){
                        builder.append(temp);
                    }
                }

            }
            s = builder.toString();
        }
        return s;

    }

    public static void main(String[] args) {
        new Java38().countAndSay(4);
    }
}
