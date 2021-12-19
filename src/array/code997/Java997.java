package array.code997;

/**
 * 997. 找到小镇的法官
 *
 * 解题思路：能成为法官的条件是不信任他人，别人都信任自己（也就是n-1个人）
 * 定义一个二维数组int[][0]表示信任他人数量，int[][1]表示被信任数量
 * 当array[i][0] == 0 && array[i][1] == n - 1时 就是法官
 */

public class Java997 {
    public int findJudge(int n, int[][] trust) {
        int[][] array = new int[n + 1][2];
        for (int[] ints : trust) {
            array[ints[0]][0]++;
            array[ints[1]][1]++;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i][0] == 0 && array[i][1] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
