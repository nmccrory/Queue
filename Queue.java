/**
 * Author: Nick McCrory
 * Date: 3/9/2017
 */

public class Queue {
    private Node first = null;
    private int count = 0;

    private class Node {
        int data;
        Node next = null;

        public Node(int data) {
            this.data = data;
        }
    }

    // Construct an empty Queue.
    public Queue(){};
    // Construct a Queue with a starting Node.
    public Queue(int data) {
        this.add(data);
    }

    public void add(int data) {
        Node n = new Node(data);

        if (this.first != null) {
            n.next = this.first;
        }
        this.first = n;
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public boolean isEmpty() {
        if (this.count > 0) {
            return false;
        }
        return true;
    }
}
