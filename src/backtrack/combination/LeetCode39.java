package backtrack.combination;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * candidates = [2,3,6,7], target = 7.
 * 无重复元素 的整数数组 candidates 和一个目标整数 target ，找出 candidates 中可以使数字和为目标数 target 的所有不同组合.
 * candidates 中的同一个数字可以无限制重复被选取 .
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-28 23:10
 */
public class LeetCode39 {
    static List<List<Integer>> result = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();
    public static void main(String[] args) {
        List<List<Integer>> lists = combinationSum(new int[]{2,3,6,7}, 7);
        for(List<Integer> list:lists){
            System.out.println(list.toString());
        }
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target){
        backTracking(candidates,target,0,0);
        return result;
    }

    private static void backTracking(int[] candidates,int target,int sum, int startIndex){ //1.确定回溯函数的参数和返回值
        //2.确定终止条件(**这个终止条件所依靠的一定要在回溯函数的参数中！**)
        if(sum > target){
            return;
        }
        if(sum == target){
            result.add(new ArrayList<>(path));
            return;
        }

        //3.单层搜索的逻辑
        for(int i =  startIndex; i<candidates.length;i++){
            path.add(candidates[i]);
            sum += candidates[i];
            backTracking(candidates,target,sum,i);
            sum -= candidates[i];
            path.removeLast();
        }
    }
}
