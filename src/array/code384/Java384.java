package array.code384;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 384. 打乱数组
 */

public class Java384 {
}

class Solution {

    int[] nums;
    int[] chang;

    public Solution(int[] nums) {
        this.nums = nums;
        this.chang = nums.clone();
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int num : nums) {
            list.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = random.nextInt(list.size());
            chang[i] = list.get(temp);
            list.remove(temp);
        }
        return chang;
    }
}
