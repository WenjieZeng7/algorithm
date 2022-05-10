package lc100;

import com.sun.org.apache.bcel.internal.generic.LUSHR;
import org.junit.Test;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/group-anagrams/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-07 21:34
 */
public class Hot49_字母异位词分组_哈希表 {
    @Test
    public void groupAnagrams(){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String,List<String>> map = new HashMap<>();  //哈希表结构采用Map
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); //排序后的值
            List<String> list = map.getOrDefault(key,new ArrayList<String>()); //map.getOrDefault()方法
            list.add(str);  //放入原始值
            map.put(key,list); //直接用map.put()方法的特性，要是value不同的话直接覆盖
        }
        ArrayList<List<String>> result = new ArrayList<>(map.values());
        for (List<String> list:result
             ) {
            for (String str:list
                 ) {
                System.out.print(str+ "\t");
            }
            System.out.println();
        }
    }

}
