import java.util.Scanner;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-07-23 19:51
 */
public class test723 {
    public static void main(String[] args) {
        float pi = (float) 3.1415927;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            out[i] = (int)(Math.round(x[i]* (0.5*(1- Math.cos(2*pi*i/n)))));
            System.out.print(out[i]+ " ");
        }
    }


}
