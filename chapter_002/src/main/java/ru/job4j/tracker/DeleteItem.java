package ru.job4j.tracker;

public class DeleteItem extends BaseAction {


	protected DeleteItem(int key, String name) {
		super(key, name);
	}

	@Override
	public String name() {
		return "=== Удаление заявки ===";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.println("-- Удаление заявки --");
		System.out.println("Введите имя: ");
		String name = input.askStr(" ");
		System.out.println("Введите ID заявки: ");
		String id = input.askStr("");
		if (tracker.delete(id)) {
			System.out.println("Заявка " + id + " удалена");
		}

		return true;
	}
}
