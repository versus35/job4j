package ru.job4j.compare;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUser {

	public Set<User> sort(List<User> list) {
		return new TreeSet<>(list);
	}

	public List<User> sortAge(List<User> list) {
		list.sort(Comparator.comparing(User::getAge));
		return list;
	}

	public List<User> sortNameLength(List<User> list) {
		list.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return Integer.compare(o1.getName().length(), o2.getName().length());
			}
		});
		return list;
	}

	List<User> sortNameByAge(List<User> list) {
		list.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				int result = o1.getName().compareTo(o2.getName());
				return result != 0 ? result : Integer.compare(o1.getAge(), o2.getAge());
			}
		});
		return list;
	}
}