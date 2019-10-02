package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
	public void init(Scanner scanner, Tracker tracker) {
		boolean run = false;
		while (true) {
			this.showMenu();
			System.out.println("Выбор меню :");
			int select = Integer.parseInt(scanner.nextLine());
			if (select == 0) {
				System.out.println("==== Добавление новой заявки====");
				System.out.println("Введите имя: ");
				String name = scanner.nextLine();
				Item item = new Item(name);
				tracker.add(item);
				System.out.println("Новая заявка " + item.getId() + "добавлена");
			} else if (select == 1) {
				System.out.println("=== Список всех заявок ===");
				Item[] allItems = tracker.findAll();
				for (int i = 0; i < allItems.length; i++) {
					System.out.println("Заявка: " + allItems[i].getId());
					System.out.println("Имя: " + allItems[i].getName());
				}
			} else if (select == 2) {
				System.out.println("=== Редактирование заявки ===");
				System.out.println("=== Введите ID заявки ===");
				String id = scanner.nextLine();
				Item item = tracker.findById(id);
				System.out.println("=== Введите имя ===");
				String name = scanner.nextLine();
				Item item1 = new Item(name);
				if (tracker.replace(item1, id)) {
					System.out.println("Заявка: " + id + " обновлена");
				} else {
					System.out.println("Заявки с ID: " + id + " не существует");
				}
			} else if (select == 3) {
				System.out.println("=== Удаление заявки ===");
				System.out.println("Введите ID заявки");
				String id = scanner.nextLine();
				if (tracker.delete(id)) {
					System.out.println("Заявка " + id + "удалена");
				}
			} else if (select == 4) {
				System.out.println("=== Поиск заявки по id ===");
				System.out.println("Введите ID заявки");
				String id = scanner.nextLine();
				Item item = tracker.findById(id);
				if (item != null) {
					System.out.println("Заявка " + item.getId());
					System.out.println("Имя " + item.getName());
				}
			} else if (select == 5) {
				System.out.println("=== Поиск заявки по имени ===");
				System.out.println("Введите имя");
				String name = scanner.nextLine();
				Item[] item = tracker.findByName(name);
				for (int i = 0; i < item.length; i++){
					System.out.println("Заявка " + item[i].getId());
					System.out.println("Имя " + item[i].getName());
				}
			} else if (select == 6) {
				System.out.println("=== Выход из программы ===");
				break;
			}
		}

	}

	private void showMenu() {
		System.out.println("Добавление новой заявки: 0");
		System.out.println("Показать все заявки: 1");
		System.out.println("Редактирование заявок: 2");
		System.out.println("Удаление заявки: 3");
		System.out.println("Поиск заявки по id: 4");
		System.out.println("Поиск заявки по имени: 5");
		System.out.println("Выход из программы: 6");


	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Tracker tracker = new Tracker();
		new StartUI().init(scanner, tracker);
	}
}
