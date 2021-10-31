package array.code48;

/**
 * 48. 旋转图像
 *
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 *
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-image
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *  解题思路 ： 关键点 matrix[i][j] -> matrix[j][n-1-i]
 */

public class Java48 {
    public void rotate(int[][] matrix) {

        int n = matrix.length;
        int temp1 = 0;
        int temp2 = 0;
        int i = 0;
        int j = 0;
        int temp = 0;
        int index = 0;
        int count = n / 2;
        while (i < count){
            temp1 = matrix[i][j];
            while (j < n-1-i){
                do {
                    temp2 = matrix[j][n-i-1];
                    matrix[j][n-i-1] = temp1;
                    temp1 = temp2;
                    temp = i;
                    i = j;
                    j = n - temp - 1;
                    index++;
                }while (index % 4 != 0);
                j++;
                temp1 = matrix[i][j];
            }
            i++;
            j = i;
        }
    }

    public static void main(String[] args) {
        int[][] array = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        new Java48().rotate(array);
    }
}


