package array.code350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 350. 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 解题思路：排序。先将num1和num2从小到大排序，使用双指针i,j分别指向num1[0]和num2[0]
 * 向前移动，当nums1[i] > nums2[j] 时 j++,nums1[i] < nums2[j]时 i++,相等时就是交集。
 * 注意：由于开始我们并不知道有几个交集，所以只能先创建list最后在转array
 */

public class Java350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> ans = new ArrayList<>();
        for (int i = 0,j = 0; i < nums1.length && j < nums2.length; ){
            if (nums1[i] > nums2[j]){
                j++;
            }else if (nums1[i] < nums2[j]){
                i++;
            }else {
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] a = new int[ans.size()];
        for (int d = 0; d < ans.size(); d++){
            a[d] = ans.get(d);
        }
        return a;
    }
}
