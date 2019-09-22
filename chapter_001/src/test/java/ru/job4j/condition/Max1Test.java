package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Max1Test {
	@Test
	public void whenMax1To2Then2() {
		int result = Max.max(1, 2);
		assertThat(result, is(2));
	}

	@Test
	public void whenMax2To1Then1() {
		int result = Max.max(4, 3);
		assertThat(result, is(4));
	}

	@Test
	public void whenEqual2To1() {
		int result = Max.max(5, 5);
		assertThat(result, is(5));
	}
}


