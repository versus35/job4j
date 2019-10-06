package ru.job4j.tracker;

public class StabInput implements Input {
	private String[] answers;
	private int position = 0;
	public StabInput(String[] answers) {
		this.answers = answers;
	}
	@Override
	public String askStr(String question) {
		return answers[position++];
	}

	@Override
	public int askInt(String question) {
		return Integer.parseInt(askStr(question));
	}
}
