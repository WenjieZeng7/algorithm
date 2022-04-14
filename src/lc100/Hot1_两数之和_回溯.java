package lc100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/two-sum/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-05 23:35
 */
public class Hot1_两数之和_回溯 {
    //采用回溯
    static List<List<Integer>> result = new ArrayList<>();
    static LinkedList<Integer> path = new LinkedList<>();



    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        backTracking(nums,target,0,0);
        System.out.println(result.get(0));

    }

    private static void backTracking(int[] nums,int target,int sum,int startIndex){
        if(sum == target && path.size()==2){
            result.add(new ArrayList<>(path));
            return;
        }
        if(path.size()==2){
            return;
        }
        for(int i = startIndex;i<nums.length;i++){
            sum += nums[i];
            path.add(i);
            backTracking(nums,target,sum,i+1);
            path.removeLast();
            sum -= nums[i];
        }
    }
}
