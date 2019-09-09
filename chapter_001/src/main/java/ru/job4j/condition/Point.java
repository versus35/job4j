package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static void main(String[] args) {
        double result1 = distance(0, 0, 2, 0);
        double result2 = distance(2, 5, 0, 3);
        double result3 = distance(2, 0, 1, 4);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (2, 5) to (0, 3) " + result2);
        System.out.println("result (2, 0) to (1, 4) " + result3);
    }
}
