package ru.job4j.compare;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortUserTest {
	private List<User> list = new ArrayList<>();
	private SortUser sort = new SortUser();

	@Test
	public void whenSort() {
		SortUser sortUser = new SortUser();
		List<User> list = new ArrayList<>();
		User user = new User("vova", 30);
		User user1 = new User("vovik", 12);
		User user2 = new User("vovchik", 45);
		list.add(user);
		list.add(user1);
		list.add(user2);
		List<User> result = sortUser.sortAge(list);
		List<User> expected = new ArrayList<>();
		expected.add(user1);
		expected.add(user);
		expected.add(user2);
		assertThat(result, is(expected));
	}

	@Test
	public void whenUserListSortByName() {
		SortUser sortUser = new SortUser();
		List<User> list = new ArrayList<>();
		User user = new User("vova", 30);
		User user1 = new User("vovik", 12);
		User user2 = new User("vovchik", 45);
		list.add(user);
		list.add(user1);
		list.add(user2);
		List<User> result = sortUser.sortNameLength(list);
		List<User> expected = new ArrayList<>();
		expected.add(user);
		expected.add(user1);
		expected.add(user2);
		assertThat(result, is(expected));
	}
	@Test
	public void whenUserListSortByNameByAg() {
		SortUser sortUser = new SortUser();
		List<User> list = new ArrayList<>();
		User user = new User("Сегей", 25);
		User user1 = new User("Иван", 30);
		User user2 = new User("Сергей", 30);
		User user3 = new User("Иван", 25);
		list.add(user);
		list.add(user1);
		list.add(user2);
		list.add(user3);
		List<User> result = sortUser.sortNameByAge(list);
		List<User> expected = new ArrayList<>();
		expected.add(user3);
		expected.add(user1);
		expected.add(user);
		expected.add(user2);
		assertThat(result, is(expected));
	}
}