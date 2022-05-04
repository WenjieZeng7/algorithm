package lc100;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;
import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/perfect-squares/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-25 14:42
 */
public class Hot279_完全平方数_dfs {
    @Test
    public void numSquares(){
        int n = 12;
        int[] dp = new int[n+1]; //dp[0]不用，所以长度是n+1
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 0; i - j * j >= 0 ; j++) {
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        System.out.println(dp[n]);
    }
}
