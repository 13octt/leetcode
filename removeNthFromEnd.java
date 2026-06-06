
public class removeNthFromEnd {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyNode = new ListNode(-1, head);

        ListNode slow = dummyNode;
        ListNode fast = dummyNode;

        // for (int i = 0; i < n; i++) {
        //     fast = fast.next;
        // }

        while(n > 0) {
            fast = fast.next;
            n--;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummyNode.next;
    }

    static void printList(ListNode current) {
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }
    }

    public static void main(String[] agrs) {

        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(5);

        ListNode res = removeNthFromEnd(listNode, 2);

        printList(res);
    }
}
