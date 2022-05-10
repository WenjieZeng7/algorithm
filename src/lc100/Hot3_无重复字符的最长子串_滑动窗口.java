package lc100;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-06 22:41
 */
public class Hot3_无重复字符的最长子串_滑动窗口 {
    //s由英文字母、数字、符号和空格组成
    @Test
    public void lengthOfLongestSubstring(){
        /**
         * map (k, v)，其中 key 值为字符，value 值为字符位置;
         */
        String s = "tmmzuxt";
        int length = s.length();
        int result = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int start = 0, end = 0; end < length; end++){
            char element = s.charAt(end);
            if(map.containsKey(element)){
                start = Math.max(map.get(element) + 1, start); //若出现重复，则start的位子在重复元素的下一个。
                //用Math.max的原因是为了让start不会往回走。
                //如"tmmzuxt"，在遍历到第二个'm'时，start=2；在遍历到最后的't'时，如果没有Math.max，start会为1。
            }
            map.put(element, end);  //无论如何都要put，时刻保持记录字符的位置。
            result = Math.max(result, end - start + 1);
        }
        System.out.println(result);
    }
}
