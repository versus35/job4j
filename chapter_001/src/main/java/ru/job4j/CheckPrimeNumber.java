package ru.job4j;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean b = false;
        for (int i = 1; i <= num; i++) {
            if (i %num != 0) {
                i++;
                b = false;
            } else
                b = true;


        }
        return b;
    }
}
