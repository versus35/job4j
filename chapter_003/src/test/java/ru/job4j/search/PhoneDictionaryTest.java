package ru.job4j.search;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import java.util.List;

import static org.junit.Assert.*;

public class PhoneDictionaryTest {
	@Test
	public void whenFindByName() {
		PhoneDictionary phones = new PhoneDictionary();
		phones.add(new Person("Vova", "Ivanov", "12345", "Moscow"));
		List<Person> persons = phones.find("Vova");
		assertThat(persons.iterator().next().getSurname(), is ("Ivanov"));
	}

}