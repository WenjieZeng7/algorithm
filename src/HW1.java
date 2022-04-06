import org.junit.Test;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-05 23:02
 */
public class HW1 {
    @Test
    public void demo1(){
        int k = 3;
        String s = "124asd-ABCabc-abCABc@-ABc-abC";
        String[] s1 = s.split("-");
        String out = s1[0];
        for(int i = 1;i < s1.length;i++){
            int big = 0;
            int small = 0;
            for(int j = 0; j<s1[i].length();j++){
                if(s1[i].charAt(j) >= 'a' && s1[i].charAt(j)<='z'){
                    small ++;
                }
                if(s1[i].charAt(j) >= 'A' && s1[i].charAt(j)<='Z'){
                    big ++;
                }
            }
            if(big > small){
                s1[i] = s1[i].toUpperCase();
            }
            if(big <small){
                s1[i] = s1[i].toLowerCase();
            }
            while(s1[i].length() >3){
                String temp = s1[i].substring(0, 3);
                s1[i] = s1[i].substring(3);
                out += "-"+temp;
            }
            out += "-"+s1[i];
            System.out.println(out);
        }
    }
}
