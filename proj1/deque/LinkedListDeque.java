package deque;

public class LinkedListDeque<Item> {
    private class Node {
        public Node prev;
        public Item item;
        public Node next;

        public Node(Node l, Item i, Node n) {
            prev = l;
            item = i;
            next = n;
        }
    }

    private Node sentinel;
    private int size;

    public LinkedListDeque() {
        sentinel = new Node(null, null, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    public LinkedListDeque(Item x) {
        this();
        addFirst(x);
    }

    public void addFirst(Item x) {
        Node temp = sentinel.next;
        sentinel.next = new Node(sentinel, x, sentinel.next);
        temp.prev = sentinel.next;
        size += 1;
    }

    public void addLast(Item x) {
        Node temp = sentinel.prev;
        sentinel.prev = new Node(sentinel.prev, x, sentinel);
        temp.next = sentinel.prev;
        size += 1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        for (Node p = sentinel; p.next != sentinel; p = p.next) {
            System.out.print(p.next.item + " ");
        }
        System.out.println();
    }

    public Item removeFirst() {
        if (size == 0) {
            return null;
        }
        Item remove = sentinel.next.item;
        sentinel.next = sentinel.next.next;
        sentinel.next.prev = sentinel;
        size -= 1;
        return remove;
    }

    public Item removeLast() {
        if (size == 0) {
            return null;
        }
        Item remove = sentinel.prev.item;
        sentinel.prev = sentinel.prev.prev;
        sentinel.prev.next = sentinel;
        size -= 1;
        return remove;
    }


    public static void main(String[] args) {
        LinkedListDeque<Integer> list = new LinkedListDeque<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.removeLast();
        list.printDeque();
    }
}

