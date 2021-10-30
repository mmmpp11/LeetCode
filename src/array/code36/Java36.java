package array.code36;

import java.util.HashMap;
import java.util.Map;


/**
 * 36. 有效的数独
 *
 * 请你判断一个 9x9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
 * 数独部分空格内已填入了数字，空白格用 '.' 表示。
 *
 * 注意：
 *
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-sudoku
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 *   解题思路：通过三个二维数组来存放行，列，小九宫格的数字。
 *   行，列 很好解决 主要是小九宫格 可以将每个小九宫格进行编号
 *   可以得到小九宫格的index是i/3*3+j/3
 */

public class Java36 {

    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int[][] rows = new int[n][n];
        int[][] columns = new int[n][n];
        int[][] areas = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (board[i][j] == '.'){
                    continue;
                }
                int index = board[i][j] - '1';
                rows[i][index]++;
                columns[j][index]++;
                int[] area = areas[i / 3 * 3 + j / 3];
                area[index]++;
                if (rows[i][index] > 1 || columns[j][index] > 1 || area[index] > 1){
                    return false;
                }
            }
        }
        System.out.println(1/3);
        return true;
    }
}
