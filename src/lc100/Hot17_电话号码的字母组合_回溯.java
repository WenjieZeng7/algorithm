package lc100;

import org.junit.Test;
import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-02 16:17
 */
public class Hot17_电话号码的字母组合_回溯 {
    StringBuilder sb = new StringBuilder();
    List<String> result = new ArrayList<>();
    @Test
    public void letterCombinations(){
        String digits = "23";
        if(digits.length() == 0){
            //特殊情况讨论
        }
        //ASCII码：0-48。而这个book集合：2-0。
        char[][] book= {{'a','b','c'},{'d','e','f'},
                {'g','h','i'},{'j','k','l'},{'m','n','o'},
                {'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        backTracking(0,digits,book,digits.length());
        for (String str:result
             ) {
            System.out.println(str);
        }

    }

    private void backTracking(int index, String digits,char[][] book,int length){
        if(sb.length() == length){
            result.add(String.valueOf(sb));
            return;
        }

        for (int i = 0; i < book[digits.charAt(index)-50].length; i++) {
            sb.append(book[digits.charAt(index)-50][i]);
            index ++;
            backTracking(index,digits,book,length);
            index --;
            sb.deleteCharAt(sb.length()-1);
        }
    }

}
