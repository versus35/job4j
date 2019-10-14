package ru.job4j.tracker;

public class StubAction implements UserAction {
	private boolean call = true;

	@Override
	public int key() {
		return 0;
	}

	@Override
	public String info() {
		return String.format("%s. %s", this.key(), "add new item.");
	}

	@Override
	public String name() {
		return "Stub Action";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		call = true;
		return false;
	}
	public boolean isCall() {
		return call;
	}
}
