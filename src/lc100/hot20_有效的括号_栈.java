package lc100;

import org.junit.Test;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 14:49
 */
public class hot20_有效的括号_栈 {
    @Test
    public void test(){
        String s = "[])";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c=='(' || c=='['){
                stack.push(c);
            }else{
                if(!stack.empty()){
                    char temp = stack.peek();
                    if((c == ')' && temp == '(') || (c == ']' && temp == '[') ||(c == '}' && temp =='{')){
                        stack.pop();
                    }else{
                        System.out.println("false");
                    }
                }else{
                    System.out.println("false");
                }
            }
        }
        if(stack.empty()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

}
