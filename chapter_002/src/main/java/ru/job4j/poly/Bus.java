package ru.job4j.poly;

public class Bus implements Transport {
	@Override
	public String go() {
		return null;
	}

	@Override
	public String passenger(int colPassenger) {
		return null;
	}

	@Override
	public int gas(int liter, int price) {
		int price1 = liter * price;
		return price1;
	}
}
