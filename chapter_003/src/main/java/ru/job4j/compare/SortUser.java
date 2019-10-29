package ru.job4j.compare;

import java.util.*;
import java.util.function.Function;

public class SortUser {

	public Set<User> sort(List<User> list) {
		return new TreeSet<>(list);
	}

	public List<User> sortAge(List<User> list) {
		list.sort(Comparator.comparing(User::getAge));
		return list;
	}

	public List<User> sortNameLength(List<User> list) {
//		list.sort(new Comparator<User>() {
//			@Override
//			public int compare(User o1, User o2) {
//				return Integer.compare(o1.getName().length(), o2.getName().length());
//			}
//		});
		list.sort(Comparator.comparingInt(o -> o.getName().length()));
		return list;

	}

	List<User> sortNameByAge(List<User> list) {
//		list.sort(new Comparator<User>() {
//			@Override
//			public int compare(User o1, User o2) {
//				int result = o1.getName().compareTo(o2.getName());
//				return result != 0 ? result : Integer.compare(o1.getAge(), o2.getAge());
//			}
//		});
		Comparator<User> comparator = Comparator.comparing(User::getName).thenComparing(User::getAge);
		list.sort(comparator);
		return list;
	}
}