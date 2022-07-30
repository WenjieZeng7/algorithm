import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-07-12 20:21
 */
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int max = n;
        if(m > n){
            max = m;
        }
        int out = -1;
        for (int l = 2; l <= max; l++) {
            for (int i = 0; i <= n-l; i++) {
                for (int j = 0; j <= m-l; j++) {
                    out = Math.max(out,map[i][j] + map[i+l-1][j] + map[i][j+l-1] + map[i+l-1][j+l-1]);
                }
            }
        }
        System.out.println(out);
    }
}
