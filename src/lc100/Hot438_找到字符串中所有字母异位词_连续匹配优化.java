package lc100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/find-all-anagrams-in-a-string/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-09 0:00
 */
public class Hot438_找到字符串中所有字母异位词_连续匹配优化 {
    @Test
    public void findAnagrams(){
        String s = "cbaebabacd";
        String p = "bac";
        List<Integer> res = new ArrayList<>();
        char[] chars = p.toCharArray();
        Arrays.sort(chars);
        String p1 = String.valueOf(chars);
        int index = -1;
        for (int i = 0; i <= s.length() - p.length(); i++) {
            if(index == i){
                i--;
            }
            String s1 = s.substring(i,i+p.length());
            char[] charTemp = s1.toCharArray();
            Arrays.sort(charTemp);
            String s2 = String.valueOf(charTemp);
            if(p1.equals(s2)){
                res.add(i);
                System.out.println(i);
                while(i != s.length() - p.length() && s.charAt(i) == s.charAt(i+p.length())){
                    index = i+1;
                    res.add(index);
                    System.out.println(index);
                    i++;
                }
            }
        }
    }
}
/*
执行用时：1088 ms, 在所有 Java 提交中击败了8.53% 的用户
内存消耗：42.4 MB, 在所有 Java 提交中击败了45.62% 的用户
 */

