package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
	public static List<Integer> toArray(Integer[][] matrix) {
		return Stream.of(matrix).flatMap(x -> Stream.of(x)).collect(Collectors.toList());
	}
}
