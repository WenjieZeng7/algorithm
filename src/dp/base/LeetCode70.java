package dp.base;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶.
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-30 23:09
 * 1.dp[i]的含义：i：第i阶楼梯，第i阶楼梯有dp[i]种方式。
 * 2.dp[i]=dp[i-1]+dp[i-2]。从i-1阶楼梯走1步，从i-2阶楼梯走2步。
 * 3.初始化，dp[1]=1,dp[2]=2
 * 4.顺序，从1->n
 * 5.打印dp数组，用于debug
 */
public class LeetCode70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));

    }

    public static int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n ==2){
            return 2;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i =3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
