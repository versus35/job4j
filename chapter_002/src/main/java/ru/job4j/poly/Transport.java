package ru.job4j.poly;

public interface Transport {
	String go();
	String passenger(int colPassenger);
	int gas(int liter, int price);
}
