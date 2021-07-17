package java_exericse;


/**
 * 动态规划
 *
 * f(i) = Math.max(f(i-1)+nums(i),nums(i))
 */

public class Exercise53 {

    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        //f[i] :以nums[i]为结尾的和最大的连续子数组的和
        int[] f = new int[nums.length];
        f[0] = nums[0];
        for (int i=1; i<nums.length; i++){
            f[i] = Math.max(f[i-1]+nums[i],nums[i]);
            ans = Math.max(f[i],ans);
        }
        return ans;
    }
}
