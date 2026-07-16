package deque;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayDequeTest {
    @Test
    public void addFirstLastSizeTest() {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        assertEquals(4, list.size());
    }

    @Test
    public void isEmptyTest() {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        list.addFirst(1);
        assertFalse("链表为空", list.isEmpty());
    }

    @Test
    public void printTest() {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.printDeque();
    }

    @Test
    public void removeTest() {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.removeFirst();
        list.removeLast();
        list.printDeque();
    }

    @Test
    public void getTest() {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        int actual = list.get(1);
        assertEquals(2, actual);
    }
}
