package lc100.模拟;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/find-all-anagrams-in-a-string/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-09 0:00
 */
public class Hot438_找到字符串中所有字母异位词_模拟 {
    @Test
    public void findAnagrams(){
        List<Integer> res = new ArrayList<>();
        String s = "cbaebabacd";
        String p = "bac";
        char[] chars = p.toCharArray();
        Arrays.sort(chars);
        String p1 = String.valueOf(chars);
        for (int i = 0; i <= s.length() - p.length(); i++) {
            String s1 = s.substring(i,i+p.length());
            char[] charTemp = s1.toCharArray();
            Arrays.sort(charTemp);
            String s2 = String.valueOf(charTemp);
            if(p1.equals(s2)){
                res.add(i);
                System.out.println(i);
            }
        }
    }
}
/*
执行用时：2124 ms, 在所有 Java 提交中击败了5.02% 的用户
内存消耗：42.6 MB, 在所有 Java 提交中击败了29.93% 的用户
 */
