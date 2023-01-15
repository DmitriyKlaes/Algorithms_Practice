package ru.gb.sem_01;

/*
Найти все простые число от 1 до n (и распечатать их в консоль).
*/

import java.util.ArrayList;
import java.util.List;

public class AllSimpleNumbers {
    public static void main(String[] args) {
        System.out.println(findPrimeNumbers(100));
    }

    public static List<Integer> findPrimeNumbers(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                result.add(i);
            }
        }
        return result;
    }
}
