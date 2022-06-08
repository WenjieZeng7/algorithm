package lc100;

import org.junit.Test;

import java.util.Stack;

/**
 * https://leetcode.cn/problems/daily-temperatures/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-08 23:15
 * 题解：
 * https://leetcode.cn/problems/daily-temperatures/solution/dai-ma-sui-xiang-lu-dai-ni-xue-tou-dan-d-kwbv/
 *
 * 栈内放index
 */
public class Hot739_每日温度_单调栈 {
    @Test
    public void dailyTemperatures(){
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int temp = stack.pop();
                answer[temp] = i - temp;
            }
            // 无论如何都要放
            stack.push(i);
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
/*
执行用时：139 ms, 在所有 Java 提交中击败了55.84% 的用户
内存消耗：53.8 MB, 在所有 Java 提交中击败了33.54% 的用户
 */
