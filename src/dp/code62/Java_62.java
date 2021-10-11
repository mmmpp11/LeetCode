package dp.code62;


/**
 * 62. 不同路径
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 *
 * 问总共有多少条不同的路径？
 *
 * 状态转移方程：{
 *     只有当j=0时 才只能向下移，这时：array[i][j] = array[i-1][j]
 *     只有当i=0时，才只能向右移，这时：array[i][j] = array[i][j-1]
 *     在起点时，array[i][j] = 1
 *     其余情况均为 array[i][j] = array[i][j-1] + array[i-1][j]
 * }
 */
public class Java_62 {

    public int uniquePaths(int m, int n) {

        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0;j < n; j++){
                if (i == 0 && j == 0){
                    array[0][0] = 1;
                }else if (i == 0 && j > 0){
                    array[i][j] = array[i][j-1];
                }else if(j == 0 && i > 0){
                    array[i][j] = array[i-1][j];
                }else {
                    array[i][j] = array[i-1][j] + array[i][j-1];
                }
            }
        }
        return array[m-1][n-1];
    }

}
