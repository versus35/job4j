package ru.job4j.converter;




public class Converter {
	public static int rubleToEuro(int value) {
		return value / 70;
	}

	public static int rubleToDollar(int value) {
		return value / 60;
	}

	public static int euroToRubles(int value) {
		return value * 70;
	}

	public static int dollarToRuble(int value) {
		return value * 60;
	}

	public static void main(String[] args) {
		int euro = rubleToEuro(140);
		int dollar = rubleToDollar(120);
		int rublesEuro = euroToRubles(40);
		int rublesDollar = dollarToRuble(60);
		System.out.println("140 + rubles are " + euro + " euro");
		System.out.println("120 + rubles are " + dollar + " dollar");
		System.out.println("40 + euro are + " + rublesEuro + " ruble");
		System.out.println("60 + dollar + " + rublesDollar + " ruble");
	}

}


