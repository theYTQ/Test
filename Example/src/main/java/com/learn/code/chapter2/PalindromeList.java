package com.learn.code.chapter2;

import org.apache.commons.lang.time.StopWatch;

public class PalindromeList {
    public static void main(String[] args) {
        ListNode list = ListNode.generateList(new int[]{1, 2, 3, 6, 3, 2, 1});
        System.out.println(isPalindrome(list));
        ListNode.printList(list);
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode next = slow.next;
        slow.next = null;
        ListNode head2 = reverseList(next);
        boolean res = checkSameValue(head, head2);
        slow.next = reverseList(head2);
        return res;
    }

    public static boolean checkSameValue(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return (list1 == null || list1.next == null) && list2 == null;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
