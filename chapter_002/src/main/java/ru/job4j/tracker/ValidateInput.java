package ru.job4j.tracker;

import java.util.List;

public class ValidateInput extends ConsoleInput {

	private final Input input;

	public ValidateInput(final Input input) {
		this.input = input;
	}

	@Override
	public String ask(String question) {
		return this.input.ask(question);
	}

	@Override
	public int ask(String question, List<Integer> range) {
		boolean invalid = true;
		int answer = -1;
		do {
			try {
				answer = this.input.ask(question, range);
				invalid = false;
			} catch (MenuOutException e) {
				System.out.print(String.format("Пожалуйста, выберите пункт меню.%n"));
			} catch (NumberFormatException e) {
				System.out.print(String.format("Пожалуйста, введите корректное значение.%n"));
			}
		} while (invalid);
		return answer;
	}
}