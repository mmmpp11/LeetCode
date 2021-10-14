package dp.code65;

import java.util.ArrayList;
import java.util.List;


/**
 * 120. 三角形最小路径和
 *
 * 给定一个三角形 triangle ，找出自顶向下的最小路径和。
 *
 * 每一步只能移动到下一行中相邻的结点上。相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 三角形简图如下：
 *      2
 *     3 4
 *    6 5 7
 *   4 1 8 3
 *
 *   我们可以吧它想象成
 *   2
 *   3 4
 *   6 5 7
 *   4 1 8 3
 *
 *   可得第一列的路径只可能是 2 -> 3 -> 6 -> 4
 *   最外层斜列只可能时 2 -> 4 -> 7 -> 3
 *   其他点均有两条路径
 *
 *   可以设array(i,j) 为点（i,j）的最小值
 *
 *   由此可得状态方程：
 *   当 i=j=0时 array[i][j] += triangle.get(i).get(j)
 *   当 j == 0 && i > 0时 array[i][j] = array[i-1][j] + triangle.get(i).get(j)
 *   当 j == i时 array[i][j] = array[i-1][j-1] + triangle.get(i).get(j)
 *   其余时刻 array[i][j] = Math.min(array[i-1][j],array[i-1][j-1]) + triangle.get(i).get(j)
 */
public class Java65 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int n = triangle.get(m-1).size();
        int min = Integer.MAX_VALUE;
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j <= i; j++){
                if (i == 0 && j ==0){
                    array[i][j] = 0;
                }else if (j == 0 && i > 0){
                    array[i][j] = array[i-1][j];
                }else if (j == i){
                    array[i][j] = array[i-1][j-1];
                }else {
                    array[i][j] = Math.min(array[i-1][j],array[i-1][j-1]);
                }
                array[i][j] += triangle.get(i).get(j);
                if (i == m-1 && array[i][j] < min){
                    min = array[i][j];
                }
            }
        }
        return min;

    }
}
