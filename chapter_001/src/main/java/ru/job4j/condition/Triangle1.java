package ru.job4j.condition;

public class Triangle1 {
    public static boolean exist(double ab, double ac, double bc) {
        boolean triangle = true;
        if ((ab + ac > bc) && (ac + bc > ab) && (ab + ab + bc > ac)) {
            return (ab + ac > bc) || (ac + bc > ab) || (ab + ab + bc > ac);
        }
        return triangle;
    }
}
