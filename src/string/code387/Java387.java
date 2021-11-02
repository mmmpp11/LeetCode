package string.code387;

import java.util.HashMap;

/**
 * 387. 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 解题思路：hash遍历
 */

public class Java387 {
    public int firstUniqChar(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        char[] array = s.toCharArray();
        for (char i : array){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        for (int i = 0; i < array.length; i++){
            if (map.get(array[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}
