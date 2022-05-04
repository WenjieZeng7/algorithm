package lc100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/top-k-frequent-elements/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-04 15:48
 */
public class Hot347_前K个高频元素_Map排序 {
    @Test
    public void topKFrequent(){
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] out = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> result = new ArrayList<>(map.entrySet());
        result.sort((o1,o2)->o2.getValue() - o1.getValue());  //Lamda表达式
        for (int i = 0; i < k; i++) {
            out[i] = result.get(i).getKey();
            System.out.println(out[i]);
        }
    }

}
