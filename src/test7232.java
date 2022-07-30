import sun.nio.cs.ext.MacHebrew;

import java.util.Scanner;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-07-23 19:51
 */
public class test7232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int out = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int l1 = (int) (Math.pow(x[i]-x[j],2) +Math.pow(y[i]-y[j],2));
                    int l2 = (int) (Math.pow(x[i]-x[k],2) +Math.pow(y[i]-y[k],2));
                    int l3 = (int) (Math.pow(x[k]-x[j],2) +Math.pow(y[k]-y[j],2));
                    if(l1 + l2 == l3 || l1 + l3 == l2 || l2 + l3 == l1){
                        out++;
                    }
                }
            }
        }
        System.out.println(out);
    }
}
