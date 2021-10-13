package dp.code63;


/**
 * 63. 不同路径 II
 *
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 *解题思路：此题思路延续题62 ,有障碍物则表示该点（i,j）的路径数array[i][j]为0
 *          则只需在增加一个状态 ： obstacleGrid[i][j] == 1 时 array[i][j] = 0
 */

public class Java63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (obstacleGrid[i][j] == 1){
                    array[i][j] = 0;
                }else if (i == 0 && j == 0){
                    array[i][j] = 1;
                }else if (i == 0 && j > 0){
                    array[i][j] = array[i][j-1];
                }else if (j == 0 && i > 0){
                    array[i][j] = array[i-1][j];
                }else {
                    array[i][j] = array[i-1][j] + array[i][j-1];
                }
            }
        }
        return array[n-1][m-1];
    }
}
