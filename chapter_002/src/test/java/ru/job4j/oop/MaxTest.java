package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {
	@Test
	public void whenMax1To2Then2() {
		Max max = new Max();
		int result = max.max(1, 2);
		assertThat(result, is(2));
	}

	@Test
	public void whenMax1To2To3() {
		Max max = new Max();
		int result = max.max(4, 3, 6);
		assertThat(result, is(6));
	}

	@Test
	public void whenMax1To2To3To4() {
		Max max = new Max();
		int result = max.max(3, 5, 7, 8);
		assertThat(result, is(8));
	}

}