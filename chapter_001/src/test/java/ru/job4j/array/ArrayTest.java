package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayTest {
	@Test
	public void mergeTo1() {
		int[] A = new int[]{1, 2, 3, 4};
		int[] B = new int[]{5, 6, 7, 8};
		int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
		int[] result = Array.merge(A, B, input);
		int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
		Assert.assertThat(result, is(expected));
	}

	@Test
	public void mergeTo2() {
		int[] a = new int[]{5, 6, 7, 8};
		int[] b = new int[]{10, 20, 30, 40};
		int[] input = new int[]{5, 6, 7, 8, 10, 20, 30, 40};
		int[] result = Array.merge(a, b, input);
		int[] expected = {5, 6, 7, 8, 10, 20, 30, 40};
		Assert.assertThat(result, is(expected));
	}
}
