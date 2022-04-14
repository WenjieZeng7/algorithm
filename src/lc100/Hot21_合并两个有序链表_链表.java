package lc100;

/**
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 15:09
 */
public class Hot21_合并两个有序链表_链表 {
    //https://leetcode-cn.com/problems/merge-two-sorted-lists/
}

/*
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(-1);  //用这个来找到链表头的位子，同时也用于循环迭代。
        ListNode temp = dummyHead;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }else{
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }
        if(list1 != null){
            temp.next = list1;
        }
        if(list2 != null){
            temp.next = list2;
        }
        return dummyHead.next;
    }
}
*/
