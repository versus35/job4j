package ru.job4j.search;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhoneDictionary {
	private List<Person> persons = new ArrayList<Person>();

	public void add(Person persons) {
		this.persons.add(persons);
	}

	public List<Person> find(String key) {
		List<Person> result = new ArrayList<>();
		for (var person : this.persons) {
			if (person.getAddress().contains(key)
					|| person.getName().contains(key)
					|| person.getPhone().contains(key)
					|| person.getSurname().contains(key)) {
				result.add(person);
			}
		}
		return result;
	}
}
