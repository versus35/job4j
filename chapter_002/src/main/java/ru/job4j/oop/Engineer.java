package ru.job4j.oop;

public class Engineer extends Profession {
	private String qualification;
	private String degree;

	public Engineer(String qualification, String degree) {
		super("Vova", "Petrov", "higher", "01.01.1969");
		this.qualification = qualification;
		this.degree = degree;
	}
}
