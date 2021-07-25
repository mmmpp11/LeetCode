package java_exericse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


/**
 * 面试题 10.02. 变位词组
 */

public class audition1002 {

    public List<List<String>> groupAnagrams(String[] strs) {

//        int index = 0;
//        HashMap<String,Integer> map = new HashMap<>();
//        List<List<String>> ans = new ArrayList<>();
//        for(String i : strs){
//            char[] temp = i.toCharArray();
//            Arrays.sort(temp);
//            if (!map.containsKey(Arrays.toString(temp))){
//                ans.add(new ArrayList<>());
//                map.put(Arrays.toString(temp),index);
//                index++;
//            }
//            ans.get(map.get(Arrays.toString(temp))).add(i);
//            ans.set(map.get(Arrays.toString(temp)),ans.get(map.get(Arrays.toString(temp))));
//        }

        //  简写
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for (String i : strs){
            char[] temp = i.toCharArray();
            Arrays.sort(temp);
            List<String> list = map.getOrDefault(Arrays.toString(temp),new ArrayList<>());
            list.add(i);
            map.put(Arrays.toString(temp),list);

        }
        for (String key : map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }


}
