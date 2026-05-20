import java.util.ArrayList;
import java.util.Collections;

public class mergeTwoSortedLists {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    // ArrayList<Integer> arr = new ArrayList<>();

    // while (list1 != null) {
    // arr.add(list1.val);
    // list1 = list1.next;
    // }

    // while (list2 != null) {
    // arr.add(list2.val);
    // list2 = list2.next;
    // }

    // Collections.sort(arr);

    // ListNode dummyNode = new ListNode(-1);
    // ListNode curr = dummyNode;

    // for (int i = 0; i < arr.size(); i++) {
    // curr.next = new ListNode(arr.get(i));
    // curr = curr.next;
    // }

    // return dummyNode.next; // not return dummny node
    // }

    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }

    static void printList(ListNode curr) {
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
    }

    public static void main(String[] agrs) {
        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(10);
        head1.next.next = new ListNode(15);
        head1.next.next.next = new ListNode(40);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(20);

        ListNode res = mergeTwoLists(head1, head2);
        printList(res);
    }
}