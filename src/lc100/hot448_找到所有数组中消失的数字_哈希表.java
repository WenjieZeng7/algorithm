package lc100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 22:37
 */
public class hot448_找到所有数组中消失的数字_哈希表 {
    @Test
    public void find(){
        int[] nums = {4,3,2,7,8,2,3,1};
        int length = nums.length;
        int[] hash = new int[length + 1];
        hash[0] = 1;
        for (int i = 0; i < length; i++) {
            hash[nums[i]]=1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length+1; i++) {
            if(hash[i] == 0){
                list.add(i);
            }
        }
        for (Integer i: list) {
            System.out.println(i);
        }
    }
}
