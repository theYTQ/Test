package com.learn.code.chapter2;

public class RemoveMiddleNode {
    public static void main(String[] args) {
        ListNode list = ListNode.generateList(new int[]{1, 2, 3, 4, 5});
        removeMiddleNode(list);
        ListNode.printList(list);
    }

    private static ListNode removeMiddleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            return head.next;
        }
        ListNode pre = head, cur = head.next.next;
        while (cur.next != null && cur.next.next != null) {
            pre = pre.next;
            cur = cur.next.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
