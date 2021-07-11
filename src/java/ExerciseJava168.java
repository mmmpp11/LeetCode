package java;

public class ExerciseJava168 {


    private StringBuilder str = new StringBuilder();

    public String convertToTitle(int columnNumber) {
        dfs(columnNumber);
        str.reverse();
        return str.toString();

    }

    private void dfs(int num){
        if (num == 0){
            return;
        }
        num--;
        str.append((char) ('A'+num % 26));
        dfs(num / 26);
    }

    public static void main(String[] args) {
        System.out.println((char) ('A'+701% 26));
    }
}
