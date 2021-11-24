package dp.code70;

/**
 * 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 *
 * 解题思路：array[n] = array[n-1] + array[n-2]
 */

public class Java70 {
    public int climbStairs(int n) {
        int[] array = new int[n+1];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < n+1; i++){
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }
}
