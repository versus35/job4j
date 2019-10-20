package ru.job4j.list;

import java.util.Objects;

public class User {
	private String name;
	private Integer id;
	private String city;

	public User(String name, Integer id, String city) {
		this.name = name;
		this.id = id;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(name, user.name) &&
				Objects.equals(id, user.id) &&
				Objects.equals(city, user.city);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, id, city);
	}
}
