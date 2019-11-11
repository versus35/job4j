package ru.job4j.stream;

public class Student implements Comparable<Student> {
	private int score;
	private String name;
	private String lastName;

	public Student(int score) {
		this.score = score;
	}

	public Student(String name, int score) {
		this.score = score;
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public Student(String name, String lastName, int score) {
		this.name = name;
		this.lastName = lastName;
		this.score = score;
	}

	public int getScore() {
		return this.score;
	}

	@Override
	public int compareTo(Student student) {
		return Integer.compare(student.getScore(), this.score);
	}

	public  String getName() {
		return name;
	}
}
