package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrimesTest {
    @Test
    public void PrimesTest17() {
        assertTrue(Primes.isPrime(17));
    }

    @Test
    public void PrimesTest2() {
        assertTrue(Primes.isPrime(2));
    }

    @Test
    public void PrimesTest5() {
        assertTrue(Primes.isPrime(5));
    }
}
