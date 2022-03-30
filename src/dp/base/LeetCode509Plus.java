package dp.base;

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

//只依赖前一个，所以可以不用维护一个数组，而只有3个变量
public class LeetCode509Plus {
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
        int dp0 = 0;
        int dp1 = 1;
        int sum = -1;
        for (int i = 2; i<=n;i++){
            sum = dp0 + dp1;
            dp0 = dp1;
            dp1 = sum;
        }
        return sum;
    }
}
