package lc100;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/counting-bits/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 21:36
 */
public class hot338_比特位计数_数学 {
    @Test
    public void count(){
        int n = 5;
        int[] out = new int[n+1];
        for (int i = 0; i <= n; i++) {
            out[i] = Integer.bitCount(i);
            System.out.println(out[i]);
        }
    }
}
