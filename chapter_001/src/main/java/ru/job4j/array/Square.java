package ru.job4j.array;

import java.util.Arrays;

public class Square {
	public int[] calculate(int bound) {
		int[] array = new int[bound];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.pow(i + 1, 2);
		}

		return array;
	}

}
