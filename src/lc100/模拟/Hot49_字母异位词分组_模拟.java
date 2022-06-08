package lc100.模拟;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/group-anagrams/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-07 21:34
 * 超时
 * 模拟：就是没有算法，全靠理解
 */
public class Hot49_字母异位词分组_模拟 {
    List<List<String>> result = new ArrayList<>();
    @Test
    public void groupAnagrams(){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<String> list1 = new ArrayList<>();
        list1.add(strs[0]);
        result.add(list1);
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < result.size(); j++) {
                if(isMatch(strs[i],result.get(j).get(0))){
                    result.get(j).add(strs[i]);
                    break; //必须存在，配合下面的判断条件
                }
                if(j == result.size()-1){  //遍历完所有已经存在的List<String>还是没有
                    List<String> temp = new ArrayList<>();
                    temp.add(strs[i]);
                    result.add(temp);
                    break;
                }
            }
        }
        for (List<String> list:result
             ) {
            for (String str:list
                 ) {
                System.out.print(str+ "\t");
            }
            System.out.println();
        }
    }

    //判断2个字符串是否是字母异位词
    private boolean isMatch(String s1,String s2){
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        String s11 = new String(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        String s22 = new String(c2);
        if(s11.equals(s22)){
            return true;
        }else{
            return false;
        }
    }
}
