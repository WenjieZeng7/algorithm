package lc100;

import org.junit.Test;

import java.util.Stack;

/**
 * https://leetcode.cn/problems/largest-rectangle-in-histogram/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-27 13:46
 * 题解：
 * https://www.bilibili.com/video/BV16D4y1D7ed?spm_id_from=333.337.search-card.all.click
 *
 * 所谓哨兵，就是在原数组头尾都加一个0.
 * 哨兵的应用还有在单链表的虚拟节点。
 * 这样可以减少条件判断。
 *
 */
public class Hot84_柱状图中的最大矩形_单调栈_哨兵 {
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

        // 加入哨兵数组
        int[] newHeights = new int[length +2];
        for (int i = 0; i < length; i++) {
            newHeights[i+1] = heights[i];
        } // 其他的默认值就是0

        // 这样引用，代码就不用修改了！秒啊！
        length += 2;
        heights = newHeights;

        int area = heights[0];
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 加入头哨兵，则以下都省略了栈非空的判断
        for (int i = 1; i < length; i++) {
            // 先写最难的逻辑，出栈
            while (heights[stack.peek()] > heights[i]){
                int height = heights[stack.pop()];
                int width = i - stack.peek() -1;
                area = Math.max(area,height*width);
            }

            // 其他的情况，怎么样都要入栈的
            stack.push(i);
        }
        System.out.println(area);

        // 因为有尾哨兵0的存在，不用再弹栈。
        // 最后栈内就只剩两个哨兵0。
    }
}

/**
 执行用时：151 ms, 在所有 Java 提交中击败了35.12% 的用户
 内存消耗：53.9 MB, 在所有 Java 提交中击败了71.02% 的用户
 */
