package ru.job4j.tracker;

public class SubInput implements Input {
	@Override
	public String askStr(String question) {
		return null;
	}

	@Override
	public int askInt(String question) {
		return Integer.parseInt(null);
	}
}
