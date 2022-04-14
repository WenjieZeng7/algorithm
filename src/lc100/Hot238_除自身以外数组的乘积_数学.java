package lc100;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/product-of-array-except-self/submissions/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-11 22:32
 */
public class Hot238_除自身以外数组的乘积_数学 {
    //不要使用除法
    //在 O(n) 时间复杂度内完成此题。
    @Test
    public void times(){
        int[] nums = {1,2,3,4};
        int length = nums.length;

        int[] left = new int[length];  //nums[i]左边的乘积
        left[0] = 1;

        int[] right = new int[length];  //nums[i]右边的乘积
        right[length -1] = 1;

        int[] out = new int[length]; //结果集
        for (int i = 1; i < length; i++) {
            left[i] = nums[i-1] * left[i-1];
            right[length - 1 - i] = nums[length - i] * right[length -i];
        }
        for (int i = 0; i < length; i++) {
            out[i] = left[i] * right[i];
        }
        for (int i = 0; i < length; i++) {
            System.out.println(out[i]);
        }
    }
}
