package lc100;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode.cn/problems/kth-largest-element-in-an-array/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-09 13:52
 */
public class Hot215_数组中的第K个最大元素_堆排序 {
    @Test
    public void findKthLargest(){
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        //大根堆
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        //往堆里放元素，建堆
        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
        }
        //取出第K个
        for (int i = 0; i < k-1; i++) {
            maxHeap.poll();
        }
        System.out.println(maxHeap.poll());

    }
}
