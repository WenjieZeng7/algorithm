package lc100.链表;

/**
 * https://leetcode-cn.com/problems/sort-list/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-11 23:03
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Hot148_排序链表_归并排序_快慢指针_Map排序 {
      //方法1：对Map进行排序的方式，*只能*借助List<EntrySet<,>。
      //方法2：链表的归并排序
      public ListNode sortList(ListNode head) {
            if(head == null || head.next == null){
                  return head;
            }

            //快慢指针进行拆分
            //这里没有用链表判环中fast和slow一起从head出发
            //因为若拆分至2个节点，slow和fast同走一轮，slow会走到后一个节点，不方便拆分
            ListNode fast = head.next, slow = head;
            while(fast != null && fast.next != null){
                  fast = fast.next.next;
                  slow = slow.next;
            }

            //截止后，slow指向后半部分的首个节点，中间断开
            ListNode temp = slow.next;
            slow.next = null; //将中间断开
            //递归
            ListNode left = sortList(head);
            ListNode right = sortList(temp);

            return merge(left,right);
      }

      //合并两个有序链表
      public ListNode merge(ListNode list1, ListNode list2){
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
      /*
      执行用时：5 ms, 在所有 Java 提交中击败了99.76% 的用户
      内存消耗：48.8 MB, 在所有 Java 提交中击败了59.34% 的用户
       */
}



/*
//自己写的，排序HashMap
class Solution {
    List<ListNode> list = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();  //<序号，值>
    int index = 0;
    ListNode result;  //用于构建结果链表
    public ListNode sortList(ListNode head) {
        if(head == null){
            return null;
        }
        while(head != null){
            list.add(head);
            map.put(index++,head.val);
            head = head.next;
        }
        List<Map.Entry<Integer,Integer>> sort = new ArrayList<>(map.entrySet());
        sort.sort((o1,o2)->o1.getValue() - o2.getValue());  //Lamda表达式
        for (int i = 0; i < map.size() -1 ; i++) {
            result = list.get(sort.get(i).getKey());
            result.next = list.get(sort.get(i+1).getKey());
        }
        if(map.size() > 1){
             result.next.next = null; //解决环
        }
        return list.get(sort.get(0).getKey());
    }
}
 */