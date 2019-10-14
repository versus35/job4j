package ru.job4j.tracker;

public class FindAllAction implements UserAction {
	@Override
	public String name() {
		return "=== Поиск всех заявок ===";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.println("-- Поиск всех заявок --");
		Item[] allItems = tracker.findAll();
		for (int i = 0; i < allItems.length; i++) {
			System.out.println("Заявка: " + allItems[i].getId());
			System.out.println("Имя: " + allItems[i].getName());
		}
		return true;
	}
}
