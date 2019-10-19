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
		for (Person value : persons) {
			if((key.contains(value.getName())
				||key.contains(value.getSurname())
				||key.contains(value.getPhone())
				||key.contains(value.getAddress())
			)) {
				result.add(value);
			}
		}
		return result;
	}
}
