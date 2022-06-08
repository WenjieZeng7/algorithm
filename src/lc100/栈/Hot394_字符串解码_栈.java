package lc100.栈;

import org.junit.Test;

import java.util.Stack;

/**
 * https://leetcode.cn/problems/decode-string/
 *
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-11 17:01
 * s 由小写英文字母、数字和方括号 '[]' 组成
 */
public class Hot394_字符串解码_栈 {
    @Test
    public void decodeString() {
        String s = "3[a2[c]]";
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {  //连续的字符串
                int temp = i + 1;
                while (temp < s.length() && s.charAt(temp) >= 'a' && s.charAt(temp) <= 'z') {
                    temp++;
                }
                stack.push(s.substring(i, temp));
                i = temp - 1;  //-1是因为i之后还会自增
            } else if (c >= '0' && c <= '9') {  //找到数字
                int temp = i + 1;
                while (s.charAt(temp) >= '0' && s.charAt(temp) <= '9') {
                    temp++;
                }
                stack.push(s.substring(i, temp));
                i = temp - 1;  //-1是因为i之后还会自增
            } else if (c == '[') {
                stack.push("[");
            } else if (c == ']') {
                StringBuilder sb0 = new StringBuilder();
                String temp = stack.pop();
                while (!temp.equals("[")) {  //一直取出直到'['
                    sb0.insert(0, temp);
                    temp = stack.pop();
                }
                int times = Integer.parseInt(stack.pop());
                StringBuilder sb = new StringBuilder(sb0.length() * times);
                for (int j = 0; j < times; j++) {
                    sb.append(sb0.toString());
                }
                stack.push(sb.toString());
            }
        }

        //最后将stack中的所有string取出并拼接
        StringBuilder out = new StringBuilder();
        while (!stack.empty()) {
            out.insert(0, stack.pop());
        }
        System.out.println(out.toString());
    }
}
