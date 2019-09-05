package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean result = true;
        int max = result ? first : second;
        if (first > second){
            max = first;
        }else if( first < second){
            max = second;
        }
        return max;
    }
}
