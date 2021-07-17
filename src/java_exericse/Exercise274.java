package java_exericse;


/**
 * 274. H 指数
 */

import java.util.Arrays;
public class Exercise274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int ans = 0;
        for(int i = citations.length-1; i>=0 ;i--){
            if(citations[i]>= citations.length-i){
                ans = citations.length - i;
            }
        }
        return ans;
    }
}
