package dp.code931;


/**
 * 931. 下降路径最小和
 *
 * 给你一个 n x n 的 方形 整数数组 matrix ，请你找出并返回通过 matrix 的下降路径 的 最小和 。
 *
 * 下降路径 可以从第一行中的任何元素开始，并从每一行中选择一个元素。在下一行选择的元素和当前行所选元素最多相隔一列（即位于正下方或者沿对角线向左或者向右的第一个元素）。具体来说，位置 (row, col) 的下一个元素应当是 (row + 1, col - 1)、(row + 1, col) 或者 (row + 1, col + 1) 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-falling-path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 解题思路： 我们可以设array(i,j）为到点（i,j）时的最小值
 *
 * 由题意得
 *      当j = 0 时 array（i,j）只能来自 array(i-1)(j) 或 array(i-1)(j+1)
 *      当j = n-1 时 array（i,j）只能来自 array(i-1)(j) 或 array(i-1)(j-1)
 *      其余时刻 array（i,j）来自 array(i-1)(j) 或 array(i-1)(j+1) 或 array(i-1)(j-1)
 *      由此 即可编写状态转换方程
 */

public class Java931 {
    public int minFallingPathSum(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int min = Integer.MAX_VALUE;
        if (m > 1){
            for (int i = 1; i < m; i++){
                for (int j = 0; j < n; j++){
                    if (j == 0){
                        matrix[i][j] += Math.min(matrix[i-1][j],matrix[i-1][j+1]);
                    }else if (j == n-1){
                        matrix[i][j] += Math.min(matrix[i-1][j],matrix[i-1][j-1]);
                    }else {
                        matrix[i][j] += Math.min(Math.min(matrix[i-1][j-1],matrix[i-1][j]),matrix[i-1][j+1]);
                    }
                }
            }
        }
        for (int i = 0; i < n; i++){
            if (min > matrix[m-1][i]){
                min = matrix[m-1][i];
            }
        }
        return min;
    }
}
