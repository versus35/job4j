package ru.job4j.oop;

public class Tiger extends Animal {
	public Tiger(String name) {
		super("Cat");
		System.out.println(name);
	}

	public static void main(String[] args) {
		Tiger tiger = new Tiger("bars");
	}
}
