package lc100.栈;

import org.junit.Test;

import java.util.Stack;

/**
 * https://leetcode.cn/problems/largest-rectangle-in-histogram/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-27 13:46
 * 题解：
 * https://www.bilibili.com/video/BV16D4y1D7ed?spm_id_from=333.337.search-card.all.click
 *
 * 之前的暴力解法超时，就想着应该**用空间换时间**
 * 只是思路里有FIFO，就马上想着用栈
 * 再结合题目特点，就想到了单调栈这个数据结构
 *
 * 栈中存放的是index，通过heights数组，可以很快用index确定值。
 *
 */
public class Hot84_柱状图中的最大矩形_单调栈 {
    @Test
    public void largestRectangleArea(){
        int[] heights = {0,3,2,5};
        int length = heights.length;
        // 特殊情况处理
        if(length == 0){
            System.out.println(0);
            return;
        }
        if(length == 1){
            System.out.println(heights[0]);
            return;
        }

        int area = heights[0];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            // 先写最难的逻辑，出栈
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]){
                int height = heights[stack.pop()];

                // 处理连续相等的情况，直接pop掉没关系
                while(!stack.isEmpty() && heights[stack.peek()] == height){
                   stack.pop();
                }

                int width;
                if(stack.isEmpty()){
                    width = i; // 单调栈，最后出栈的一定是在0到i内最小的，所以宽度就直接是i
                }else{
                    width = i - stack.peek() -1;
                }

                area = Math.max(area,height*width);
            }

            // 其他的情况，怎么样都要入栈的
            stack.push(i);
        }


        // 对栈内**剩下的**元素进行处理
        while (!stack.isEmpty()){
            int height = heights[stack.pop()];

            // 处理连续相等的情况
            while(!stack.isEmpty() && heights[stack.peek()] == height){
                stack.pop();
            }

            int width;
            if(stack.isEmpty()){
                width = length;
            }else{
                width = length - stack.peek() - 1;
            }

            area = Math.max(area,height*width);
        }
        System.out.println(area);
    }
}

/**
 * 执行用时：176 ms, 在所有 Java 提交中击败了20.81% 的用户
 * 内存消耗：51.1 MB, 在所有 Java 提交中击败了95.74% 的用户
 */
