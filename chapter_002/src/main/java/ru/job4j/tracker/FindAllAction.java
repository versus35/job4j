package ru.job4j.tracker;

public class FindAllAction extends BaseAction {


	protected FindAllAction(int key, String name) {
		super(key, name);
	}

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
