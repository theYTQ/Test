package com.learn.code.chapter2;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;

import java.util.Objects;

public class ListCommonPart {
    public static void main(String[] args) {
        ListNode list1 = ListNode.generateList(new int[]{1, 2, 3, 4, 5, 6});
        ListNode list2 = ListNode.generateList(new int[]{1, 5, 6, 7, 8, 9});
        ListNode.printList(list1);
        printCommonPart(list1, list2);
    }

    /**
     * 两个有序链表
     */
    public static void printCommonPart(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.val == list2.val) {
                System.out.println(list1.val);
                list1 = list1.next;
                list2 = list2.next;
            } else if (list1.val < list2.val) {
                list1 = list1.next;
            } else {
                list2 = list2.next;
            }
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode generateList(int[] nums) {
        if (ObjectUtils.isEmpty(nums)) {
            return null;
        }
        ListNode head = new ListNode(), cur = head;
        for (int num : nums) {
            ListNode next = new ListNode(num);
            cur.next = next;
            cur = next;
        }
        return head.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" >> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public static ListNode getTailNode(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode tail = node;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }
}
