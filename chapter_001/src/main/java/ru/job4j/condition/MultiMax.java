package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int max = (first > second ? first : second);
        max = third > max ? third : max;
        return max;
            }

        }




