
public class rotateList {

    static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode rotateRight(ListNode head, int k) {
        // head
        // 1    -> 2 -> 3
        // temp

        if (head == null || head.next == null) {
            return head;
        }

        // get length of head
        int length = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k %= length;

        if (k == 0) {
            return head;
        }

        tail.next = head;

        ListNode newTail = head;

        int step = length - k - 1;

        for (int i = 0; i < step; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;

        // cat vong
        newTail.next = null;

        return newHead;

    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.println(node.val);

            node = node.next;
        }
    }

    public static void main(String[] args) {

        ListNode lists = new ListNode(1);
        lists.next = new ListNode(2);
        lists.next.next = new ListNode(3);

        ListNode res = rotateRight(lists, 1000000001);

        printList(res);
    }
}
