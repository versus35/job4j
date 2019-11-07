package ru.job4j.stream;

public class Student implements Comparable<Student> {
	private int score;

	public Student(int score) {
		this.score = score;
	}

	public int getScore() {
		return this.score;
	}

	@Override
	public int compareTo(Student student) {
		return Integer.compare(student.getScore(), this.score);
	}
}
