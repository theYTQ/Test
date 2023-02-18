package com.learn.code.chapter2;

public class ReverseList {
    public static void main(String[] args) {
        ListNode list = ListNode.generateList(new int[]{1, 2, 3, 4, 5, 6});
        ListNode.printList(reverseListDfs(list));
        DoubleListNode doubleList = DoubleListNode.generateList(new int[]{1, 2, 3, 4, 5, 6});
        DoubleListNode.printList(reverseDoubleList(doubleList));
        DoubleListNode doubleList2 = DoubleListNode.generateList(new int[]{1, 2, 3, 4, 5, 6});
        DoubleListNode.printListReverse(reverseDoubleList(doubleList2));
    }

    private static ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    private static ListNode reverseListDfs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseListDfs(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    private static DoubleListNode reverseDoubleList(DoubleListNode head) {
        DoubleListNode pre = null, next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.prev = next;
            pre = head;
            head = next;
        }
        return pre;
    }
}
