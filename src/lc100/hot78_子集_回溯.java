package lc100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/subsets/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-10 16:33
 */
public class hot78_子集_回溯 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    @Test
    public void subsets(){
        int[] nums= {1,2,3};
        backtrack(nums,0);
        result.add(new ArrayList<>());  //加一个空集
        for (List<Integer> list: result
             ) {
            System.out.println(list);
        }

    }

    public void backtrack(int[] nums,int startIndex){
        if(path.size() == nums.length){
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            result.add(new ArrayList<>(path));
            backtrack(nums,i+1);
            path.removeLast();
        }
    }
}
