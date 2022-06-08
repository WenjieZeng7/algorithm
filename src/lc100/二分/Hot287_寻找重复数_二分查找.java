package lc100.二分;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/find-the-duplicate-number/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-14 17:58
 */
public class Hot287_寻找重复数_二分查找 {
    @Test
    public void getSame(){
        int[] nums = {1,3,4,2,2};
        //初始的左右值应该看题意，数字在[1,n]范围内，nums长度为n+1。
        int left = 1;
        int right = nums.length - 1;
        while(left <= right){  //二分查找范式<=
            int mid = left + (right - left)/2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] <= mid){
                    count ++;
                }
            }
            if(count > mid){
                //说明重复的元素在左半边
                right = mid -1;  //二分查找范式right = mid-1
            }else{
                left = mid + 1;  //二分查找范式left = mid+1
            }
        }
        System.out.println(left);
    }
}
