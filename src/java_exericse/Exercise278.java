package java_exericse;


/**
 * 278. 第一个错误的版本
 */

public class Exercise278 {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left<right){
            //会溢出
//            int mid = (left+right)/2;
            int mid = (right-left)/2+left;
            if (isBadVersion(mid) == false){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }

    private Boolean isBadVersion(int n){
        return true;
    }
}
