package ru.gb.sem_01;

public class Eratosfen {
    public static void main(String[] args) {
        findPrimeNumbers(100);
    }
    public static void findPrimeNumbers(int max) {
        boolean[] used = new boolean[max + 1];
        int res;
        for (int i = 2; i <= max; i++) {
            if (!used[i]) {
                System.out.println(i);
                for (int j = 2; j <= max; j++) {
                    res = i * j;
                    if (res <= max) {
                        used[res] = true;
                    }
                }
            }
        }
    }
}