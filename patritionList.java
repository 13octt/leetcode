
public class patritionList {

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

    static ListNode patrition(ListNode head, int x) {

        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);

        ListNode lTail = left;
        ListNode rTail = right;

        while (head != null) {

            if (head.val < x) {
                lTail.next = head;
                lTail = lTail.next;
            } else {
                rTail.next = head;
                rTail = rTail.next;
            }

            lTail.next = rTail.next;
            rTail.next =null;


            head = head.next;
        }

        return left.next;
    }

    public static void main(String[] args) {

    }

}
