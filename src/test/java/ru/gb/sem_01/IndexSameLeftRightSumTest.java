package ru.gb.sem_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class IndexSameLeftRightSumTest {

    // continues integration continues delivery
    // master

    // TDD Test Driven Development

    @Test
    public void testFindCenter() {
        int index = IndexSameLeftRightSum.findCenter(new int[]{1, 2, 5, 7, 12, 5, 3, 7});
        Assertions.assertEquals(4, index);
    }

    @Test
    public void testFindCenterNotFound() {
        int index = IndexSameLeftRightSum.findCenter(new int[]{1, 2, 5, 7, 12, 5, 3, 7, 1});
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void testFindCenterNullArray() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> IndexSameLeftRightSum.findCenter(null)
        );
    }

    @Test
    public void testFindPrimeNumber() {
        // 2, 3, 5, 7, 11, 13
        List<Integer> primeNumber = IndexSameLeftRightSum.findPrimeNumber(16);
        Assertions.assertEquals(6, primeNumber.size());
        Assertions.assertTrue(primeNumber.contains(2));
        Assertions.assertTrue(primeNumber.contains(2));
        Assertions.assertTrue(primeNumber.contains(2));
        Assertions.assertTrue(primeNumber.contains(2));
        Assertions.assertTrue(primeNumber.contains(2));
    }

}