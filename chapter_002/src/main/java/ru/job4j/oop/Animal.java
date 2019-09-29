package ru.job4j.oop;

public class Animal {
	private String name;
	public Animal(String name) {
		this.name = name;
		System.out.println(name);
	}

	public static void main(String[] args) {
		Animal animal = new Animal("Cat");

	}
}
