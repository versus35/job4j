package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
	@Override
	public String name() {
		return "=== Поиск заявки по ID ===";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.println("-- Поиск заявки по ID --");
		System.out.println("Введите ID заявки: ");
		String id = input.askStr("");
		Item item = tracker.findById(id);
		if (item != null) {
			System.out.println("Заявка " + item.getId());
			System.out.println("Имя " + item.getName());
		} else if (tracker.findById(id) == null) {
			System.out.println("Заявка " + id + " не найдена");
		}
		return true;
	}
}
