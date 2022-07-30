package lc100.滑动窗口;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/find-all-anagrams-in-a-string/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-09 0:00
 * 统计窗口内 各个字母 的数量和p是否一致
 */
public class Hot438_找到字符串中所有字母异位词_滑动窗口_哈希表 {
    @Test
    public void findAnagrams(){
        String s = "cbaebabacd";
        String p = "bac";
        List<Integer> res = new ArrayList<>();
        int sLen = s.length();
        int pLen = p.length();
        if(sLen < pLen){
            return;
        }

        // 哈希表
        int[] sCount = new int[26]; // 26个小写字母
        int[] pCount = new int[26];

        for (int i = 0; i < pLen; i++) {
            pCount[p.charAt(i)-'a'] ++;
            sCount[s.charAt(i)-'a'] ++;
        }
        if(Arrays.equals(sCount,pCount)){
            res.add(0);
            System.out.println(0);
        }

        for (int i = 0; i < sLen - pLen; i++) {
            sCount[s.charAt(i)-'a'] --;
            sCount[s.charAt(i+pLen)-'a'] ++;
            if(Arrays.equals(sCount,pCount)){
                res.add(i+1);
                System.out.println(i+1);
            }
        }
    }
}
/*
执行用时：7 ms, 在所有 Java 提交中击败了86.36% 的用户
内存消耗：42.5 MB, 在所有 Java 提交中击败了30.62% 的用户
 */

