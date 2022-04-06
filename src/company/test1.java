package company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * 阿里钉钉
 * 去掉字符串中的重复字符，1-2种方法
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-01 22:34
 */
public class test1 {

    @Test
    public void method1(){
        String str = "abca";
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){
            if(!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
            }
        }
        System.out.println(list.toString());
    }
}
