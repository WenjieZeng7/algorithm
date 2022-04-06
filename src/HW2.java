import org.junit.Test;

/**
 * https://blog.nowcoder.net/n/a1b39358f0ca429cb1ea4b53ca89bc14
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 11:28
 */
public class HW2 {
    @Test
    public void coding(){
        long[] a = new long[50];
        a[0] = 1;
        a[1] = 2;
        a[2] = 4;
        for (int i = 3; i < 50; i++) {
            a[i] = a[i-1]+a[i-2]+a[i-3];
        }
        String str = "xy";
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append((char)((str.charAt(i)-'a'+a[i]%26)%26 + 'a'));
        }
        System.out.println(sb);
    }

}
