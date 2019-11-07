package ru.job4j.tracker;


import java.util.function.Consumer;

public class Exit extends BaseAction {
	private final StartUI ui;

	public Exit(int key, String info, StartUI ui) {
		super(key, info);
		this.ui = ui;
	}

	@Override
	public void execute(Input input, Tracker tracker) {
		this.ui.stop();
	}
}