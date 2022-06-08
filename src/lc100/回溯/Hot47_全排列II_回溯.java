package lc100.回溯;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/permutations-ii/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-15 13:42
 */
public class Hot47_全排列II_回溯 {
    //去重⼀定要对元素经⾏排序，这样我们才⽅便通过相邻的节点来判断是否重复使⽤了。
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    @Test
    public void sortII(){
        int[] nums = {1,1,1,2};
        Arrays.sort(nums);  //必须排序
        boolean[] used = new boolean[nums.length];
        backtrick(nums,used);
        for (List<Integer> list: result
             ) {
            System.out.println(list);
        }
    }

    private void backtrick(int[] nums,boolean[] used){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i] == true || (i != 0 && nums[i] == nums[i-1] && used[i-1] == false)){
                //或前的条件是如果nums[]中没有重复数字的条件
                //或后的条件就是用来满足已排序nums[]下，前一个nums[i-1]是否相同，以及通过used[i-1]判断是否在同一层。
                continue; //**
            }
            path.add(nums[i]);
            used[i] = true;
            backtrick(nums,used);
            used[i] = false;
            path.removeLast();
        }
    }

}
