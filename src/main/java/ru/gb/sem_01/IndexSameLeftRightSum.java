package ru.gb.sem_01;
/*
Найти такой индекс в массиве,
что сумма элементов слева и справа равны.
*/

import java.util.List;

public class IndexSameLeftRightSum {
    public static void main(String[] args) {
        int[] arrayNumbers = {1, 2, 5, 7, 12, 5, 3, 7};
        int center = findCenter(arrayNumbers);
        System.out.println(center);
    }

    public static int findCenter(int[] arrayForFind) {
        if (arrayForFind == null || arrayForFind.length <= 2) {
            throw new IllegalArgumentException("Array must contains at least 3 elements");
        }
        int sum = 0;
        int tempLeft = 0;
        int tempRight;
        for (int i = 0; i < arrayForFind.length; i++) {
            sum += arrayForFind[i];
        }
        for (int i = 1; i < arrayForFind.length - 1; i++) {
            tempLeft += arrayForFind[i - 1];
            tempRight = sum - tempLeft - arrayForFind[i];
            if (tempLeft == tempRight) {
                return i;
            }
        }
        return -1;
    }

    public static List<Integer> findPrimeNumber(int n) {
        throw new UnsupportedOperationException();
    }
}
