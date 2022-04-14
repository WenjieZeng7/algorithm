package lc100;

import org.junit.Test;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/majority-element/submissions/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 17:42
 */
public class Hot169_多数元素_数学 {
    //题目说了一定有

    @Test
    public void more(){
        int[] nums = {2,2,1,1,1,2,2};
        Arrays.sort(nums);
        System.out.println(nums[nums.length/2]);
    }
}
