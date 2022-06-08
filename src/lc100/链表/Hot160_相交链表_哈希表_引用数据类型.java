package lc100.链表;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 22:04
 */
public class Hot160_相交链表_哈希表_引用数据类型 {
    //对于引用数据类型，如果其在哈希表中，则代表后面的节点都在哈希集合中。
    //因为***引用数据类型要相等，就是要指向同一个对象***。
    //题目中的相交，就是2个链表用了同1个共同链表。

}

/*
//哈希表-引用数据类型
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        Set<ListNode> list = new HashSet<>();  //用Set而不用List，可以避免成环
        while(A != null){
            list.add(A);
            A = A.next;
        }
        while(B != null){
            if(list.contains(B)){
                return B;
            }else{
                B = B.next;
            }
        }
        return null;
    }
}
 */