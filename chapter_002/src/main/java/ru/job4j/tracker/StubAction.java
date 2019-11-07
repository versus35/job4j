package ru.job4j.tracker;

public class StubAction implements UserAction {
	private boolean call = true;

	@Override
	public int key() {
		return key();
	}


	@Override
	public String info() {
		return info();
	}

	@Override
	public void execute(Input input, Tracker tracker) {
		call = true;

	}
}
