package ru.job4j.compare;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortUserTest {
	private SortUser sort = new SortUser();
	@Test
	public void whenSort() {
		SortUser sortUser = new SortUser();
		List<User> users = List.of(
				new User("vovka", 30),
				new User("vovik",12),
				new User("vovchik", 45)
		);
		List<User> result = sortUser.sortAge(users);
		Set<User> expected =  Set.of(
				new User("vovik", 12),
				new User("vovka", 30),
				new  User("vovchik", 45)
		);
		assertThat(result, is (expected));
	}

}