package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
	@Test
	public void square() {
		double s = 2;
		double out = SqArea.square(6, 2);
		Assert.assertEquals(s, out, 001);
	}

	@Test
	public void squares() {
		double s = 2;
		double out = SqArea.square(4, 1);
		Assert.assertEquals(s, out, 001);
	}

	@Test
	public void squaresTo3Then2() {
		double s = 2;
		double out = SqArea.square(3, 2);
		Assert.assertEquals(s, out, 001);
	}

	@Test
	public void squaresTo4Then3() {
		double s = 2;
		double out = SqArea.square(4, 3);
		Assert.assertEquals(s, out, 001);
	}
}
