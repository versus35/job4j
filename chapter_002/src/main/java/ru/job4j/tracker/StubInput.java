package ru.job4j.tracker;

import java.util.List;

public class StubInput implements Input {
	private List<String> answers;
	private int position;

	public StubInput(List<String> answers) {
		this.answers = answers;
	}

	@Override
	public String ask(String question) {
		return this.answers.get(position++);
	}

	@Override
	public int ask(String question, List<Integer> range) {
		boolean exist = false;
		int key = Integer.parseInt(this.answers.get(position++));
		for (int number : range) {
			if (number == key) {
				exist = true;
				//break;
			}
		}
		if (!exist) {
			throw new MenuOutException("Out of menu range.");
		}
		return key;
	}


}