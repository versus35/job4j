package ru.job4j.calculator;

/**
 * Fit calculator.
 *
 * @autor Viktor Bulankin.
 * @since 09.09.2019.
 * version 1.0
 */

public class Fit {
	/**
	 * Method manWeight.
	 *
	 * @param height
	 * @return (идеальный вес мужчины по формуле).
	 */
	
	public static double manWeight(double height) {
		
		return (height - 100) * 1.15;
	}
	
	/**
	 * @param height
	 * @return (идальный вес женщины по фомуле).
	 */
	public static double womanWeight(double height) {
		
		return (height - 110) * 1.15;
	}
	
	/**
	 * Main.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		double man = manWeight(183);
		double woman = womanWeight(165);
		System.out.println("Идеальный вес для мужчины: " + man);
		System.out.println("Идеальный вес для женщины: " + woman);
	}
}