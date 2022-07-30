import org.junit.Test;

import java.lang.annotation.ElementType;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-07-28 20:10
 */
public class Test7282 {
    @Test
    public void uniquePaths () {
        int m = 3;
        int n = 2;
        // write code here
//        double out = 0;
//        for (int i = 0; i < m-1; i++) {
//            out += (n + i) / (i + 1);
//        }
//        System.out.println((int)out);
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || j ==0){
                    dp[i][j] = 1;
                    continue;
                }
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}
