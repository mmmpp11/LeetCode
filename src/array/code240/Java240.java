package array.code240;

/**
 * 240. 搜索二维矩阵 II
 *
 * 解题思路：
 *
 * 1  <-  4  <- 7
 * |      |     |
 * v      v     v
 * 2  <-  5  <- 8
 *
 * 想象成以右上角为节点的树,小于target时去左子树，大于时去右子树
 */

public class Java240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int a = 0;
        while (n >= 0 && a <= m){
            if (target < matrix[a][n]){
                n--;
            }else if (target > matrix[a][n]){
                a++;
            }else {
                return true;
            }
        }
        return false;
    }

}
