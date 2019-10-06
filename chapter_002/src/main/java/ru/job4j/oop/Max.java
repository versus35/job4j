package ru.job4j.oop;

public class Max {
	public static int max(int first, int second) {
		int max = first > second ? first : second;
		return max;

	}

	public int max(int first, int second, int third) {

		return this.max(this.max(first, second), third);
	}

	public int max(int first, int second, int third, int forth) {
		return this.max(this.max(first, second, third), forth);
	}
}
