package ru.job4j.tracker;

public class StubAction implements UserAction {
	private boolean call = true;

	@Override
	public int key() {
		return key();
	}

	@Override
	public String name() {
		return "Stub action";
	}

	@Override
	public String info() {
		return info();
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
