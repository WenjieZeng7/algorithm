package lc100.排序;

import org.junit.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/top-k-frequent-elements/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-04 15:48
 */
public class Hot347_前K个高频元素_堆排序 {
    //题目要求需要时间复杂度优于O(n log n)
    //快排：平均O(n log n),最好O(n log n),最坏O(n^2)
    //堆排：平均/最好/最坏O(n log n)
    @Test
    public void topKFrequent(){
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] out = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //用最小堆，PriorityQueue优先级队列就是，不用自己构造堆
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });
        //确认堆内只有k个元素
        for (Integer key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (map.get(key) > map.get(pq.peek())) {
                pq.remove();  //最小堆，堆顶元素是最小值
                pq.add(key);
            }
        }
        //取出堆中元素
        for (int i = 0; i < k; i++) {
            out[i] = pq.remove();
            System.out.println(out[i]);
        }
    }

}
