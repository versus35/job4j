package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

public class FindAllAction extends BaseAction {
	private final Consumer<String> output;

	protected FindAllAction(int key, String name, Consumer<String> output) {
		super(key, name);
		this.output = output;
	}

	@Override
	public String name() {
		return "=== Поиск всех заявок ===";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.println("-- Поиск всех заявок --");
		List<Item> allItems = tracker.findAll();
		for (Item i : allItems) {
			System.out.println("Заявка: " + i.getId());
			System.out.println("Имя: " + i.getName());
		}
		return true;
	}
}
