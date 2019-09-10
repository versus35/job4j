package ru.job4j.array;


public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1;
        int index = 0;
        for (int i = 0; i <data.length; i++) {
            if (data[index] == el) {
                rst = index;
                break;
            } else
                return -1;
        }
        return rst;
    }
}
