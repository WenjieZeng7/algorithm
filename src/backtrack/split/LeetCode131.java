package backtrack.split;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给你一个字符串s，请你将s分割成一些子串，使每个子串都是回文串 。返回s所有可能的分割方案。
 * 输入：s = "aab"
 * 难点：什么是切割线
 * 难点：怎么表示子串
 * 输出：[["a","a","b"],["aa","b"]]
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-30 21:39
 */
public class LeetCode131 {
    static List<List<String>> result = new ArrayList<>();
    static LinkedList<String> path = new LinkedList<>();
    public static void main(String[] args) {
        partition("aab");
        for(List<String> list : result){
            System.out.println(list);
        }
    }

    public static List<List<String>> partition(String s) {
        backtricking(s,0);
        return result;
    }

    private static void backtricking(String s,int startIndex){ //1.确定参数和返回值
        if (startIndex == s.length()){ //2.确定终止条件
            // 能到达最后的，就是结果
            result.add(new ArrayList<>(path));
            return;
        }

        //3.单层处理逻辑
        for (int i = startIndex; i < s.length(); i++){
            if(isIt(s,startIndex,i)){
                //是回文串，才放入path中
                path.add(s.substring(startIndex,i+1));
            }else{
                continue; //能到达最后的，才是结果
            }
            backtricking(s,i+1);
            path.removeLast(); //回溯
        }
    }

    //判断一个字符串s是否为回文串
    private static boolean isIt(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }


}
