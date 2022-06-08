package lc100.模拟;

import org.junit.Test;

/**
 * https://leetcode.cn/problems/sliding-window-maximum/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-20 0:17
 * 极限用例超时
 */
public class Hot239_滑动窗口最大值_模拟 {
    @Test
    public void maxSlidingWindow(){
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] out = new int[nums.length - k + 1];
        //第一次找
        int max = nums[0];
        int index = 0;  //是在长度为k的窗口中的序号
        for (int i = 1; i < k; i++) {
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        out[0] = max;
        //之后的滑动
        for (int i = 1; i < out.length; i++) {
            //滑出去的是最大值，就所有再比一次
            if(index == 0){
                max = nums[i];
                for (int j = 1; j < k; j++) {
                    if(nums[i+j] > max){
                        max = nums[i+j];
                        index = j;
                    }
                }
            }else{
                //滑出去的不是最大值
                if(nums[i+k-1] > max){
                    max = nums[i+k-1];
                    index = k-1;
                }else{
                    index --;
                }
            }
            out[i] = max;
        }
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }
}
