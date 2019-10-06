package ru.job4j.oop;

public class Student extends Object {
	public void music() {
		System.out.println("Tra-ta-ta");
	}

	public void song() {
		System.out.println("I believe I can fly");
	}

	public static void main(String[] args) {
		Student petr = new Student();
		petr.music();
		petr.music();
		petr.music();
		petr.song();
		petr.song();
		petr.song();
	}
}
