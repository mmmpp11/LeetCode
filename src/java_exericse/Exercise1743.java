package java_exericse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  1743. 从相邻元素对还原数组
 */

public class Exercise1743 {

    int max = Integer.MAX_VALUE;

    public int[] restoreArray(int[][] adjacentPairs) {

        int[] ans = new int[adjacentPairs.length+1];
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer, List<Integer>> map1 = new HashMap<>();
        for (int[] i : adjacentPairs){


            map.put(i[0],map.getOrDefault(i[0],0)+1);
            map.put(i[1],map.getOrDefault(i[1],0)+1);
            List<Integer> list = map1.getOrDefault(i[0], new ArrayList<>());
            list.add(i[1]);
            map1.put(i[0],list);
            List<Integer> list1 = map1.getOrDefault(i[1], new ArrayList<>());
            list1.add(i[0]);
            map1.put(i[1],list1);
        }

        for (Map.Entry<Integer,Integer> i : map.entrySet()){
            if (i.getValue() == 1){
                ans[0] = i.getKey();
                break;
            }
        }
        for (Map.Entry<Integer,List<Integer>> i : map1.entrySet()){
            System.out.println(i.getKey()+":"+i.getValue());
        }
        ans[1] = map1.get(ans[0]).get(0);
        if(2 < ans.length){
            dfs(map1,ans[1],ans,2);
        }
        return ans;
    }

    private void dfs(HashMap<Integer,List<Integer>> map,int n,int[] ans,int index){
        List<Integer> list = map.get(n);
        for (int i = 0;i < 2;i++){
            if (list.get(i) != ans[index-2]){
                System.out.println(list.get(i));
                ans[index] = list.get(i);
            }
        }

        if (index < ans.length-1){
            dfs(map,ans[index],ans,++index);
        }
    }
        //超时
//    private void dfs(int[][] adjacentPairs,int n,int[] ans,int index){
//
//        int temp = 0;
//        for (int i = 0;i < adjacentPairs.length;i++ ){
//            if (adjacentPairs[i][0] ==n){
//                temp = adjacentPairs[i][1];
//                adjacentPairs[i][0] = max;
//                adjacentPairs[i][1] = max;
//                break;
//            }else if (adjacentPairs[i][1] ==n){
//                temp = adjacentPairs[i][0];
//                adjacentPairs[i][0] = max;
//                adjacentPairs[i][1] = max;
//                break;
//            }
//
//        }
//        index++;
//        ans[index] = temp;
//        if (index < adjacentPairs.length){
//            dfs(adjacentPairs,temp,ans,index);
//        }
//
//
//    }
}
