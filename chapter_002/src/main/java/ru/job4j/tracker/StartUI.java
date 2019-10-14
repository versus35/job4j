package ru.job4j.tracker;


public class StartUI {

	public void init(Input input, Tracker tracker, UserAction[] actions) {
		boolean run = true;
		while (run) {
			this.showMenu(actions);
			int select = input.askInt("Select: ", 7);
			UserAction action = actions[select];
			run = action.execute(input, tracker);
		}
	}

	private void showMenu(UserAction[] actions) {
		for (int index = 0; index < actions.length; index++) {
			System.out.println(index + ". " + actions[index].name());
		}
	}

	public static void main(String[] args) {
		Input input = new ConsoleInput();
		Input validate = new ValidateInput(input);
		Tracker tracker = new Tracker();
		BaseAction[] actions =   {
				new CreateAction(0, "Добавление новой заявки"),
				new ReplaceItem(1, "Редактирование заявки"),
				new DeleteItem(2, "Удаление заявки"),
				new FindAllAction(3, "Поиск всех заявок"),
				new FindByNameAction(4, "Поиск заявки по имени"),
				new FindByIdAction(5, "Поиск заявки по ID"),
				new Exit(6, "Выход из программы")
		};
		new StartUI().init(validate, tracker, actions);
	}
}