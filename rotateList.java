
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
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        } else {

            int i = 0;
            ListNode temp = head;
            
            while (i < k) {
                ListNode prev = head;

                while (temp.next != null) {
                    prev = temp;
                    temp = temp.next;
                }
                prev.next = null;
                temp.next = head;
                head = temp;
                i++;
            }
            return head;
        }
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
        lists.next.next = new ListNode (3);

        ListNode res = rotateRight(lists, 2);

        printList(res);
    }
}
