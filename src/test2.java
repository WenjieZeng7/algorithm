import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.util.Map;
import java.util.Scanner;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-07-12 20:21
 */
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(x,y);
        int min = Math.min(x,y);
        int times = 0;
        if(b%a != 0){
            System.out.println(-1);
            return;
        }else{
            int base = b/a;
            while (base > 1){
                if(base % max ==0){
                    base = base/max;
                    times ++;
                }else if (base % min == 0){
                    base = base/min;
                    times ++;
                }else{
                    System.out.println(-1);
                    return;
                }
            }
            System.out.println(times);
            return;
        }
    }
}
