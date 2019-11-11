package ru.job4j.stream;

import java.util.Objects;

public class Address {
	private String city;
	private String street;
	private int home;
	private int apartment;

	public Address(String city, String street, int home, int apartment) {
		this.city = city;
		this.street = street;
		this.home = home;
		this.apartment = apartment;
	}

	public int getHome() {
		return home;
	}

	public int getApartment() {
		return apartment;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	@Override
	public String toString() {
		return "Address{" +
				"city='" + city + '\'' +
				", street='" + street + '\'' +
				", home=" + home +
				", apartment=" + apartment +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Address address = (Address) o;
		return home == address.home &&
				apartment == address.apartment &&
				city.equals(address.city) &&
				street.equals(address.street);
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, street, home, apartment);
	}
}
