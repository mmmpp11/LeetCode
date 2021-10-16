package dp.code1289;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;


/**
 * 1289. 下降路径最小和  II
 *
 * 给你一个整数方阵 arr ，定义「非零偏移下降路径」为：从 arr 数组中的每一行选择一个数字，且按顺序选出来的数字中，相邻数字不在原数组的同一列。
 *
 * 请你返回非零偏移下降路径数字和的最小值。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-falling-path-sum-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 *  解题思路：该题前面依旧是dp路径问题的模板
 *  由于grid[i][j]不能由grid[i-1][j]得到，只能由除J列以外的最小值点获得
 *  所以我们需要遍历上一行除J列以外点来找到最小值
 */
/
public class Java1289 {
    public int minFallingPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        for (int i = 1; i < m; i++){
            for (int j = 0; j < n; j++){

                int min = Integer.MAX_VALUE;
                for (int q = 0; q < n; q++){
                    if (j != q){
                        min = Math.min(min,grid[i-1][q]);
                    }
                }
                grid[i][j] += min;
            }
        }
        int val = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            val = Math.min(val,grid[m-1][i]);
        }
        return val;

    }



    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int temp = 1;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                array[i][j] = temp;
                temp++;
            }
        }

        System.out.println(new Java1289().minFallingPathSum(array));
    }
}
