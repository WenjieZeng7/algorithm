package lc100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/permutations/submissions/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-10 16:55
 */
public class hot100_全排列_回溯 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    @Test
    public void arrayAll(){
        int[] nums = {1,2,3};
        boolean[] used = new boolean[nums.length];
        backTrack(nums,used);
        for (List<Integer> list: result
                ) {
            System.out.println(list);
        }
    }

    public void backTrack(int[] nums,boolean[] used){ //1.递归参数不再是组合中的startIndex了。
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i] == true){  //3.单层搜索逻辑中，加入对used[]是否已经使用的判断
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            backTrack(nums,used);
            path.removeLast();
            used[i] = false;
        }
    }
}
