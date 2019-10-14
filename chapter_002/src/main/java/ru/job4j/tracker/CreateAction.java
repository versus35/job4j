package ru.job4j.tracker;

public class CreateAction extends BaseAction {


	protected CreateAction(int key, String name) {
		super(key, name);
	}


	@Override
	public String name() {
		return "=== Добавление новой заявки ===";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.println("-- Добавление новой заявки --");
		System.out.println("Введите имя: ");
		String name = input.askStr(" ");
		Item item = new Item(name);
		tracker.add(item);
		System.out.println("Новая заявка " + item.getId() + " добавлена");
		return true;
	}
}
