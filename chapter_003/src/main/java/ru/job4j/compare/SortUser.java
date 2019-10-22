package ru.job4j.compare;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUser {

	public Set<User> sort(List<User> list) {
		return new TreeSet<>(list);
	}
	public List<User> sortAge (List<User> list)  {
		list.sort(Comparator.comparing(User::getAge).thenComparing(User::getName));
		 return list;

	}
}