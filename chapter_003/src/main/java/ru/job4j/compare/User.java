package ru.job4j.compare;

import java.awt.*;
import java.util.Objects;

public class User implements Comparable<User> {
	private String name;
	private int age;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		User user = (User) o;
		return age == user.age && Objects.equals(name, user.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{"
				+ "name='" + name + '\''
				+ ", age=" + age + '}';
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(User o) {
//		int nameCompare = this.name.compareTo(o.name == null ? "" : o.name);
//		if (nameCompare == 0) {
//			return Integer.compare(this.age, o.age);
//		}
//		return nameCompare;
		return this.age - o.getAge();
	}
}
