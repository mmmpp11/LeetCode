package java_exericse;

import java.util.Arrays;


/**
 * 用暴力果断超时了
 * 优化： 二分
 */
public class Exercise1818 {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {

        double m = Math.pow(10,9)+7;
        int n = nums1.length;
        int[] nums3 = nums1.clone();
        Arrays.sort(nums3);
        int max = 0;
        double sum = 0;
        for (int i = 0;i < n; i++){
            int temp = Math.abs(nums1[i] - nums2[i]);
            sum += temp;
            int temp2 = binarySearch(nums3,nums2[i]);
            if (max < temp - (Math.abs(nums3[temp2] - nums2[i]))){
                max = temp - (Math.abs(nums3[temp2] - nums2[i]));
            }
//            for (int j = 0;j < n; j++ ){
//                if (max < temp - (Math.abs(nums1[j] - nums2[i]))){
//                    max = temp - (Math.abs(nums1[j] - nums2[i]));
//                }
//            }
        }
        return (int) ((sum - max + m) % m);
    }

    private int binarySearch(int[] array,int target){
        int left = 0;
        int right = array.length - 1;
        while (left < right){
            int mid = (left + right) / 2;
            if (array[mid] == target){
                return mid;
            }else if (array[mid] < target){
                left = mid + 1;
            }else if (array[mid] > target){
                right = mid;
            }

        }
        return left == 0 ? 0 : Math.abs(target - array[left - 1]) >= Math.abs(target - array[left]) ? left : left - 1;
        // while(left < right){
        //     int mid = (right - left)/2 + left;
        //     if (array[mid] < target){
        //         left = mid + 1;
        //     }else {
        //         right = mid;
        //     }
        // }
        // return left;
    }
}
