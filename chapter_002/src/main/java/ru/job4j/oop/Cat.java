package ru.job4j.oop;

public class Cat {
	private String name;
	private String food;

	public void show() {
		System.out.println(this.name);
		System.out.println(this.food);
	}

	public void giveNick(String nick) {
		this.name = nick;

	}

	public void eat(String meat) {
		this.food = meat;
	}

	public static void main(String[] args) {
		Cat gav = new Cat();
		System.out.println("eat today");
		gav.eat("kotleta");
		gav.giveNick("Vasya");
		gav.show();


	}

}
