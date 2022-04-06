package lc100;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 22:47
 */
public class hot234_回文链表_链表 {
    //把节点的值放在list中
    //使用头尾指针来判断是否回文
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        System.out.println(list.size());
    }
}

/*
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int left = 0; //左指针
        int right = list.size() -1; //右指针
        while(left < right){
            if(list.get(left) != list.get(right)){
                return false;
            }else{
                left ++;
                right --;
            }
        }
        return true;
    }
}
 */
