package lc100;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/move-zeroes/submissions/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 18:02
 */
public class Hot283_移动零_双指针 {
    //**因为单向的**
    @Test
    public void zero(){
        int[] nums = {0,1,0,3,12};
        int m = 0; //指针1
        int n = 0; //指针2
        for (m = 0; m < nums.length; m++) {
            if(nums[m] != 0){
                nums[n++]= nums[m];
            }
        }
        for (int i = n; i < nums.length; i++) {
            nums[i] = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
