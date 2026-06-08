
public class deleteDuplicateFromSortedList {

    static class ListNode {

        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode deleteDuplicates(ListNode head) {

        // 1 1 1 2 3
        // 1 2 3 3 4 4 5 5
        // h
        // t
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode current = head;
        ListNode prev = dummyNode;

        while (current != null) {

            if (current.next != null && current.val == current.next.val) {

                int duplicateVal = current.val;

                while (current != null && current.val == duplicateVal) {
                    current = current.next;
                }

                prev.next = current;
            } else {
                prev = current;
                current = current.next;
            }
        }

        return dummyNode.next;
    }

    static void printList(ListNode head) {

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        ListNode lists = new ListNode(1);
        lists.next = new ListNode(2);
        lists.next.next = new ListNode(3);
        lists.next.next.next = new ListNode(3);
        lists.next.next.next.next = new ListNode(4);

        ListNode res = deleteDuplicates(lists);
        printList(res);

    }
}
