package ru.job4j.oop;

public class Predator extends Animal {
	public Predator(String name) {
		super("Cat");
		System.out.println(name);
	}

	public static void main(String[] args) {
		Predator predator = new Predator("Dog");

	}
}
