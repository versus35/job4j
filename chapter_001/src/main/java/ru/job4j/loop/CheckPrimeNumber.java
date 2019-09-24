package ru.job4j.loop;

public class CheckPrimeNumber {
	public boolean check(int num) {
		boolean number = false;
		for (int i = 1; i <= num; i++) {
			if (i % num != 0) {
				i++;
				number = false;
			} else {
				number = true;
			}


		}
		return number;
	}
}
