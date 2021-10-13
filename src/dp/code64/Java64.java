package dp.code64;

/**
 * 64. 最小路径和
 *
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 *
 * 题解： 该题依旧延续题62的思路,可以设点（a,b）最小总和为array(a,b)
 *      只能向下时 有array[i][j] = array[i-1][j] + grid[i][j];
 *      只能向右时 有array[i][j] = array[i][j-1] + grid[i][j];
 *      其余时刻 有array[i][j] = Math.min(array[i-1][j],array[i][j-1]) + grid[i][j];
 */

public class Java64 {
    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (i == 0 && j == 0){
                    array[i][j] = 0;
                }else if (i == 0 && j > 0){
                    array[i][j] = array[i][j-1];
                }else if (j == 0 && i > 0){
                    array[i][j] = array[i-1][j];
                }else {
                    array[i][j] = Math.min(array[i-1][j],array[i][j-1]);
                }
                array[i][j] += grid[i][j];
            }
        }
        return array[m-1][n-1];
    }

}
