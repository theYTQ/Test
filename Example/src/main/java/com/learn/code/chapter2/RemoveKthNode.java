package com.learn.code.chapter2;

public class RemoveKthNode {
    public static void main(String[] args) {
        ListNode list1 = ListNode.generateList(new int[]{1, 2, 3, 4, 5, 6});
        DoubleListNode list2 = DoubleListNode.generateList(new int[]{1, 2, 3, 4, 5, 6});
        DoubleListNode list3 = DoubleListNode.generateList(new int[]{1, 2, 3, 4, 5, 6});
        int k = 1;
        ListNode.printList(remove(list1, k));
        DoubleListNode.printList(remove(list2, k));
        DoubleListNode.printListReverse(remove(list3, k));

    }

    private static ListNode remove(ListNode head, int k) {
        if (head == null || k < 1) {
            return head;
        }
        ListNode cur = head;
        while (cur != null) {
            k--;
            cur = cur.next;
        }
        if (k == 0) {
            head = head.next;
        }
        if (k < 0) {
            cur = head;
            while (++k != 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }

    private static DoubleListNode remove(DoubleListNode head, int k) {
        if (head == null || k < 1) {
            return head;
        }
        DoubleListNode cur = head;
        while (cur != null) {
            k--;
            cur = cur.next;
        }
        if (k == 0) {
            head = head.next;
        }
        if (k < 0) {
            cur = head;
            while (++k != 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            if (cur.next != null) {
                cur.next.prev = cur;
            }
        }
        return head;
    }
}

class DoubleListNode {
    int val;
    DoubleListNode prev;
    DoubleListNode next;

    DoubleListNode() {}

    DoubleListNode(int val) {
        this.val = val;
    }

    DoubleListNode(int val, DoubleListNode prev, DoubleListNode next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }

    public static DoubleListNode generateList(int[] nums) {
        DoubleListNode head = new DoubleListNode(), cur = head;
        for (int num : nums) {
            DoubleListNode next = new DoubleListNode(num);
            cur.next = next;
            next.prev = cur;
            cur = next;
        }
        DoubleListNode res = head.next;
        head.next = null;
        res.prev = null;
        return res;
    }

    public static void printList(DoubleListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" >> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public static void printListReverse(DoubleListNode node) {
        while (node.next != null) {
            node = node.next;
        }
        while (node != null) {
            System.out.print(node.val);
            if (node.prev != null) {
                System.out.print(" << ");
            }
            node = node.prev;
        }
        System.out.println();
    }
}
