package java_exericse;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1736. 替换隐藏数字得到的最晚时间
 */

public class exercise1736 {
    public String maximumTime(String time) {


        char[] temp = time.toCharArray();

        StringBuilder str = new StringBuilder();
        boolean isTwo = false;
        if (temp[0] == '2'){
            isTwo = true;
        }else if (temp[0] == '?'  && temp[1] < '4'){
            temp[0] = '2';
        }
        str.append(temp[0]);
        for (int i = 1;i < temp.length;i++){
            if (temp[i] == ':'){
                str.append(temp[i]);
                continue;
            }else if (i == 1 && isTwo ){
                temp[i] = int2Char(0);
            }else if (temp[i] == '?'){
                System.out.println("i  " + i + "  temp[] " + temp[i] );
                temp[i] = int2Char(i);
            }
            str.append(temp[i]);
        }

        return str.toString();
    }

    private char int2Char(int i){
        switch (i){
            case 1:
            case 4:
                return '9';
            case 2: return '5';
            default: return '3';
        }
    }
}
