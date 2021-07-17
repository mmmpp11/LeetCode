package java_exericse;

import java.util.HashMap;
import java.util.Map;

public class ExerciseJava645 {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i<= nums.length; i++){
            int temp = map.getOrDefault(i,0);
            if (temp == 2){
                ans[0] = i;
            }else if (temp == 0){
                ans[1] = i;
            }
        }
        return ans;
    }
}
