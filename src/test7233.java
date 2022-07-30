import java.util.Scanner;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-07-23 19:51
 */
public class test7233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            s[i] = sc.nextInt();
            sum += s[i];
        }
        System.out.print("no"+" ");
        if(sum > 30 || sum < 20){
            System.out.println("no");
        }else{
            System.out.println("yes");
        }
    }
}
