package ru.job4j.stragery;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
	@Test
	public void whenSquare() {
		String std = System.lineSeparator();
		Square square = new Square();
		assertThat(square.draw(),
				is(new StringBuilder()
						.append("□□□□□□□□□")
						.append("□       □")
						.append("□       □")
						.append("□       □")
						.append("□□□□□□□□□")
						.append(std)
						.toString()
				));
	}
}
