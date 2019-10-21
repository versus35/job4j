package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MenuTracker {
	private final Consumer<String> output;
	private Input input;
	private Tracker tracker;
	private List<UserAction> action = new ArrayList<>();

	public MenuTracker(Consumer<String> output, Input input, Tracker tracker) {
		this.output = output;
		this.input = input;
		this.tracker = tracker;
	}

	public List<Integer> range() {
		return this.action.stream().mapToInt(UserAction::key).boxed().collect(Collectors.toList());
	}

	void fillActions(StartUI ui) {
		this.action.add(new CreateAction(0, "Добавление новой заявки", output));
		this.action.add(new FindAllAction(1, "Отобразить все заявки", output));
		this.action.add(new ReplaceItem(2, "Замена заявки", output));
		this.action.add(new DeleteItem(3, "Удаление заявки", output));
		this.action.add(new FindByIdAction(4, "Поиск заявки по ID", output));
		this.action.add(new FindByNameAction(5, "Поиск заявки по имени", output));
		this.action.add(new Exit(6, "Выход из программы", output));
	}

	public void select(int key) {
		this.action.get(key).execute(this.input, this.tracker);
	}

	public void show() {
		output.accept("*********** МЕНЮ ***********");
		for (UserAction action : this.action) {
			if (action != null) {
				output.accept(action.info());
			}
		}
	}
}
