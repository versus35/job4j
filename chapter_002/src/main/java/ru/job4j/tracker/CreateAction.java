package ru.job4j.tracker;

import java.util.function.Consumer;

public class CreateAction extends BaseAction {
	private final Consumer<String> output;

	protected CreateAction(int key, String name, Consumer<String> output) {
		super(key, name);
		this.output = output;
	}

	@Override
	public String name() {
		return "=== Добавление новой заявки ===";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.println("-- Добавление новой заявки --");
		System.out.println("Введите имя: ");
		String name = input.ask(" ");
		Item item = new Item(name);
		tracker.add(item);
		System.out.println("Новая заявка " + item.getId() + " добавлена");
		return true;
	}
}
