package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish){
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
