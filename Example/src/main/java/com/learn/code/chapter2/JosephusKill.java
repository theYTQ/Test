package com.learn.code.chapter2;

public class JosephusKill {
    public static void main(String[] args) {
        ListNode head = ListNode.generateList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        ListNode tail = ListNode.getTailNode(head);
        tail.next = head;
        //System.out.println(josephusKill(head, 2).val);
        System.out.println(josephusKill2(head, 2).val);
    }

    public static ListNode josephusKill(ListNode head, int m) {
        if (head == null || head.next == head || m < 1) {
            return head;
        }
        ListNode last = head;
        while (last.next != head) {
            last = last.next;
        }
        int count = 0;
        while (last != head) {
            if (++count == m) {
                last.next = head.next;
                count = 0;
            } else {
                last = last.next;
            }
            head = last.next;
        }
        return head;
    }

    public static ListNode josephusKill2(ListNode head, int m) {
        if (head == null || head.next == head || m < 1) {
            return head;
        }
        int n = 1;
        ListNode cur = head;
        while (cur.next != head) {
            cur = cur.next;
            n++;
        }
        int i = getLive(n, m);
        for (int j = 0; j < i; j++) {
            head = head.next;
        }
        head.next = head;
        return head;
    }

    public static int getLive(int n, int m) {
        if (n == 1) {
            return 1;
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = (res + m) % i;
        }
        return res;
    }
}
