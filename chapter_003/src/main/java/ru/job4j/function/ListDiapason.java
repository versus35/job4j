package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ListDiapason {
	public interface Operation {
		double calc(int start, int end);

	}

	List<Double> diapason(int start, int end, Function<Double, Double> func) {
		List<Double> result = new ArrayList<>();
		for (int value = start; value < end; value++) {
			result.add(func.apply((double) value));

		}
		return result;
	}
}
