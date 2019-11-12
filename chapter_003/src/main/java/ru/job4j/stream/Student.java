package ru.job4j.stream;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
	private Integer score;
	private String name;
	private String lastName;

	@Override
	public String toString() {
		return "Student{" + "score=" + score + ", name='" + name + '\'' + ", lastName='" + lastName + '\'' + '}';
	}

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

	public String getName() {
		return name;
	}


	@Override
	public int compareTo(Student o) {
		return o.score.compareTo(this.score);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Student student = (Student) o;
		return score == student.score && Objects.equals(name, student.name) && Objects.equals(lastName, student.lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(score, name, lastName);
	}

}

