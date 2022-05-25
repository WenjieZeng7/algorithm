package lc100;

import org.junit.Test;
import org.omg.CORBA.RepositoryIdHelper;

import java.util.LinkedList;

/**
 * https://leetcode.cn/problems/sliding-window-maximum/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-20 0:17
 * 也叫**双向队列**
 * 依据这个题解
 * https://leetcode.cn/problems/sliding-window-maximum/solution/dong-hua-yan-shi-dan-diao-dui-lie-239hua-hc5u/
 * 最大值一直是队列首部
 */
public class Hot239_滑动窗口最大值_单调队列_双向队列 {
    @Test
    public void maxSlidingWindow(){
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = new int[nums.length - k + 1];
        LinkedList<Integer> queue = new LinkedList<>(); //用LinkedList作为队列，存储的是下标
        int left,right;
        //遍历数组中元素，right表示滑动窗口右边界
        for (right = 0; right < nums.length; right++) {
            // 如果队列不为空且当前考察元素大于等于队尾元素，则将队尾元素移除。
            while (!queue.isEmpty() && nums[right] > nums[queue.peekLast()]){  //LinkedList.peekLast()
                queue.removeLast(); //右边删除
            }
            queue.add(right); //右边加入

            //左边删除只会在窗口成型后遇到，但是顺序就应该放在这里（窗口成型代码块前）
            left = right - k + 1;
            if(queue.peekFirst() < left){
                queue.removeFirst(); //左边删除
            }

            //此时的窗口已经成型
            if(right >= k-1){
                res[left] = nums[queue.peekFirst()];
            }

        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
