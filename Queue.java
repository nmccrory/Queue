import java.util.NoSuchElementException;

/**
 * Author: Nick McCrory
 * Date: 3/9/2017
 */

public class Queue {
    private Node first = null;
    private Node last = null;
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
        if (this.last != null) {
            this.last.next = n;
        }
        this.last = n;
        if (this.first == null) {
            this.first = this.last;
        }

        this.count++;
    }

    public int remove() {
        if (this.first == null) {
            throw new NoSuchElementException();
        }
        int data = this.first.data;
        this.first = first.next;
        if (this.first == null) {
            this.last = null;
        }
        this.count--;
        return data;
    }

    public int peek() {
        if (this.first != null) {
            return this.first.data;
        }
        throw new NoSuchElementException();
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
