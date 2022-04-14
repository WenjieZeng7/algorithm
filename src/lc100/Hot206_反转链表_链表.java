package lc100;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/submissions/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 17:56
 */
public class Hot206_反转链表_链表 {
    //理解链表
}

/*
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null; //反转后的末尾节点就是null
        ListNode cur = head;
        while(cur != null){
            ListNode aft = cur.next;
            cur.next = pre;
            pre = cur;
            cur = aft;
        }
        return pre;
    }
}
*/

