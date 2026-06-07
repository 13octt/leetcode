


public class queue {

    static class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node start;
    private Node end;
    private int length;

    public queue(int val) {
        Node newNode = new Node(val);
        start = newNode;
        end = newNode;
        length = 1;
    }

    public void enqueue(int value) {

        Node newNode = new Node(value);

        if (length == 0) {
            start = newNode;
            end = newNode;
        } else {
            // 1 -> 2  -> 3 -> 4
            // temp
            end.next = newNode;
            end = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if (length == 0) {
            return null;
        }

        if (length == 1) {
            start = null;
            end = null;
        }

        // FIFO

        Node temp = start;
        start = start.next;
        temp.next = null;

        length --;
        return temp;
    }

    public static void main(String[] args) {

    }
}
