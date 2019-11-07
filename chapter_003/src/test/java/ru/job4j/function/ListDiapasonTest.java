package ru.job4j.function;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ListDiapasonTest {

	@Test
	public void diapasonOne() {
		ListDiapason function = new ListDiapason();
		List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
		List<Double> expected = Arrays.asList(11D, 13D, 15D);
		assertThat(result, is(expected));
	}

	@Test
	public void diapasonSecond() {
		ListDiapason function = new ListDiapason();
		List<Double> result = function.diapason(4, 7, x -> x + 1);
		List<Double> expected = Arrays.asList(5D, 6D, 7D);
		assertThat(result, is(expected));
	}
}
