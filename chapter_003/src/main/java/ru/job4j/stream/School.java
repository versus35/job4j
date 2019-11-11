package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class School {

	public static List<Student> collect(List<Student> students, Predicate<Student> predict) {
		return students.stream().filter(predict).collect(Collectors.toList());
	}
	public static Map<String, Student> toMap(List<Student> students) {
		return students.stream()
				.collect(Collectors.toMap(e -> e.getLastName(), e -> e, (getName, getLastName) -> getLastName));
	}
}
