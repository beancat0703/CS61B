package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
    @Test
    public void testThreeAddThreeRemove() {
        AListNoResizing<Integer> A = new AListNoResizing<>();
        A.addLast(4);
        A.addLast(5);
        A.addLast(6);

        BuggyAList<Integer> B = new BuggyAList<>();
        B.addLast(4);
        B.addLast(5);
        B.addLast(6);

        assertEquals(A.size(), B.size());
        assertEquals(A.removeLast(), B.removeLast());
    }

    @Test
    public void randomizedTest() {
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList<Integer> B = new BuggyAList<>();

        int N = 5000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 4);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                B.addLast(randVal);
            } else if (operationNumber == 1) {
                // size
                int size1 = L.size();
                int size2 = B.size();
                assertEquals(size1, size2);
            } else if (operationNumber == 2) {
                // getLast
                int size1 = L.size();
                int size2 = B.size();
                if (size1 > 0 && size2 > 0) {
                    assertEquals(L.getLast(), B.getLast());
                }
            } else if (operationNumber == 3) {
                // removeLast
                int size1 = L.size();
                int size2 = B.size();
                if (size1 > 0 && size2 > 0) {
                    assertEquals(L.removeLast(), B.removeLast());
                }
            }
        }
    }
}
