package ru.job4j.stragery;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
	private String std = System.lineSeparator();
	// поле содержит дефолтный вывод в консоль.
	private final PrintStream stdout = System.out;
	// буфер для результата.
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();

	@Before
	public void loadOutput() {
		System.out.println("execute before method");
		System.setOut(new PrintStream(this.out));
	}

	@After
	public void backOutput() {
		System.setOut(this.stdout);
		System.out.println("execute after method");
	}


	@Test
	public void whenDrawSquare() {
		new Paint().draw(new Square());
		// проверяем результат вычисления
		assertThat(
				this.out.toString(),
				is(
						new StringBuilder()
								.append("□□□□□□□□□").append(std)
								.append("□       □").append(std)
								.append("□       □").append(std)
								.append("□       □").append(std)
								.append("□□□□□□□□□").append(std)
								.append(System.lineSeparator())
								.toString()
				)
		);

	}

	@Test
	public void whenTriangle() {
		new Paint().draw(new Triangle());
		// проверяем результат вычисления
		assertThat(
				this.out.toString(),
				is(
						new StringBuilder()
								.append("    △").append(std)
								.append("   △ △").append(std)
								.append("  △   △").append(std)
								.append(" △     △").append(std)
								.append("△△△△△△△").append(std)
								.append(System.lineSeparator())
								.toString()
				)
		);
	}
}
