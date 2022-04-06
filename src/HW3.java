import org.junit.Test;

import java.util.*;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-05 23:18
 */
public class HW3 {
    @Test
    public void sum(){
        String s = "a:3,b:5,c:2@a:1,b:2";
        String[] ss = s.split("@");
        String[] s1 = ss[0].split(",");
        String[] s2 = ss[1].split(",");
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>(s1.length);
        for (int i = 0; i < s1.length ; i++) {
            map.put(s1[i].charAt(0), (int) (s1[i].charAt(2)-'0'));
        }
        for (int i = 0; i < s2.length; i++) {
            map.put(s2[i].charAt(0),map.get(s2[i].charAt(0))-(s2[i].charAt(2)-'0'));
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry:entries){
            sb.append(entry.getKey()+":"+entry.getValue()+",");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
