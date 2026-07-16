package deque;

public class ArrayDeque<Item> {
    private Item[] items;
    private int nextFirst;
    private int nextLast;
    private int size;

    public ArrayDeque() {
        items = (Item[]) new Object[8];
        nextFirst = 0;
        nextLast = 1;
        size = 0;
    }

    public ArrayDeque(Item x) {
        this();
        addFirst(x);
    }

    public void addFirst(Item x) {
        items[nextFirst] = x;
        nextFirst -= 1;
        if (nextFirst < 0) {
            nextFirst = items.length - 1;
        }
        size += 1;
    }

    public void addLast(Item x) {
        items[nextLast] = x;
        nextLast += 1;
        if (nextLast > (items.length - 1)) {
            nextLast = 0;
        }
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
        int start;
        if (nextFirst == items.length - 1) {
            start = 0;
        }
        else {
            start = nextFirst + 1;
        }

        int i = start;
        for (int count = 0; count < size; count++) {
            System.out.print(items[i] + " ");
            i = (i + 1) % items.length;
        }

        System.out.println();
    }

    public Item removeFirst() {
        Item removeItem;
        if (nextFirst == items.length - 1) {
            removeItem = items[0];
        }
        else {
            removeItem = items[nextFirst + 1];
        }
        nextFirst += 1;
        size -= 1;
        return removeItem;
    }

    public Item removeLast() {
        Item removeItem;
        if (nextLast == 0) {
            removeItem = items[items.length - 1];
        }
        else {
            removeItem = items[nextLast - 1];
        }
        nextLast -= 1;
        size -= 1;
        return removeItem;
    }

    public Item get(int index) {
        if (index < 0 || index >= items.length) {
            return null;
        }
        int start;
        if (nextFirst == items.length - 1) {
            start = 0;
        }
        else {
            start = nextFirst + 1;
        }

        int i = start;
        for (int count = 0; count < index; count++) {
            i = (i + 1) % items.length;
        }
        return items[i];
    }
}
