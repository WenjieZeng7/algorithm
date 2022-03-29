package backtrack.combination;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-27 20:09
 */
//之前的思路：k个数的集合就用k重循环，但是因为k是输入的，不是确定的，所以多重for循环都没办法解决。
public class LeetCode77 {
    public static void main(String[] args) {
        List<List<Integer>> lists = combine(100, 10);
        for(List<Integer> list:lists){
            System.out.println(list.toString());
        }
    }

    static List<List<Integer>> out = new ArrayList<>(); //结果集
    static LinkedList<Integer> path = new LinkedList<>(); //符合条件的结合，用树的路径表示

    private static List<List<Integer>> combine(int n, int k){
        backtracking(n,k,1);
        return out;
    }

    private static void backtracking(int n, int k, int startIndex){
        if(path.size() == k){
            //层数控制，到达叶子节点，终止
            out.add(new ArrayList<>(path)); //需要把LinkedList转为ArrayList
            return;
        }
        for(int i = startIndex; i<= n; i++){
            path.add(i);
            backtracking(n,k,i+1);
            path.removeLast(); //回溯
        }
    }

}
