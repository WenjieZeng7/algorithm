package dp.base;

import com.sun.org.apache.regexp.internal.REUtil;

/**
 * 斐波那契数 （通常用 F(n) 表示）形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和.
 * F(0) = 0，F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给定 n ，请计算 F(n) 。
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-30 22:49
 * 1.dp[i]的含义：i：第i个fb，dp[i]第i个fb的数值。
 * 2.dp[i]=dp[i-1]+dp[i-2]
 * 3.初始化，dp[0]=0,dp[1]=1
 * 4.顺序，从0->n
 * 5.打印dp数组，用于debug
 */


public class LeetCode509 {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i =2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
