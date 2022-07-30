import java.util.Map;
import java.util.Scanner;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-07-12 20:21
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] na = new int[n];
        int[] ka = new int[n];
        for (int i = 0; i < n; i++) {
            na[i] = sc.nextInt();
            ka[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            int base = na[i];  // 当成最大值
            for (int j = 0; j < n; j++) {
                if(base>= na[j] && base - na[j] <k){
                    temp += ka[j];
                }
            }
            max = Math.max(max,temp);
        }
        System.out.println(max);
    }
}
