package ru.job4j.condition;


public class SqArea {
	public static double square(int p, int k) {
		double h = (p / 2) - k;
		double l = h * k;
		double s = l * h;

		return s;
	}

	public static void main(String[] args) {
		double result1 = square(4, 1);
		double result2 = square(6, 2);
		System.out.println("p = 4, k = 1, real " + result1);
		System.out.println("p = 6, k = 2, real " + result2);
		System.out.println("p = 3, k = 2, real " + result2);
		System.out.println("p = 4, k = 3, real " + result2);
	}
}
