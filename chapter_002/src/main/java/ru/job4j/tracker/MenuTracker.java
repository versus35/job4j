package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class MenuTracker {
	private final Consumer<String> output;

	private Input input;

	private Tracker tracker;

	private List<UserAction> actions = new ArrayList<>();

	public MenuTracker(Input input, Tracker tracker, Consumer<String> output) {
		this.input = input;
		this.tracker = tracker;
		this.output = output;
	}

	List<Integer> range() {
		return this.actions.stream().mapToInt(UserAction::key).boxed().collect(Collectors.toList());
	}

	void fillActions(StartUI ui) {
		this.actions.add(new CreateAction(0, "Добавление новой заявки", output));
		this.actions.add(new FindAllAction(1, "Отобразить все заявки", output));
		this.actions.add(new ReplaceItem(2, "Замена заявки", output));
		this.actions.add(new DeleteItem(3, "Удаление заявки", output));
		this.actions.add(new FindByIdAction(4, "Поиск заявки по ID", output));
		this.actions.add(new FindByNameAction(5, "Поиск заявки по имени", output));
		this.actions.add(new Exit(6, "Выход", ui));
	}

	void select(int key) {
		this.actions.get(key).execute(this.input, this.tracker);
	}

	void show() {
		output.accept("*********** МЕНЮ ***********");
		for (UserAction action : this.actions) {
			if (action != null) {
				output.accept(action.info());
			}
		}
	}
}