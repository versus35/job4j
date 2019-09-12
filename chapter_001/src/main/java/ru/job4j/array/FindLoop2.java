package ru.job4j.array;

public class FindLoop2 {
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i <data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}

