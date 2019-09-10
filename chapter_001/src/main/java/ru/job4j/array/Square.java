package ru.job4j.array;

import java.util.Arrays;

public class Square {
    public int[] calculate(int bound){
        int [] rst = new int[bound];
        for (int i = 0; i < rst.length; i++){
            rst[i] = (int)Math.pow(i + 1, 2);
        }

        return rst;
    }

}
