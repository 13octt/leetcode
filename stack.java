
public class stack {

    static class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

    }

    private Node top;
    private int height;

    public stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.val);

            temp = temp.next;
        }
    }

    public void push(int val) {

        Node newNode = new Node(val);

        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {

        Node temp = top;

        if (height == 0) {
            return null;
        } else {
            top = top.next;
            temp.next = null;
        }
        height --;
        return temp;
    }

    public static void main(String[] args) {

    }
}
