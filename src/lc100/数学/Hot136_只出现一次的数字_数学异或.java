package lc100.数学;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/single-number/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 16:55
 */
public class Hot136_只出现一次的数字_数学异或 {
    //数学使用异或运算^
    //x^x = 0
    //x^0 = x
    //异或满足交换律

    @Test
    public void onlyOne(){
        int[] nums = {4,1,2,1,2};
        int out = 0;
        for (int i = 0; i < nums.length; i++) {
            out ^= nums[i];
        }
        System.out.println(out);
    }
}
