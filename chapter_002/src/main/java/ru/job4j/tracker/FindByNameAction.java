package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
	@Override
	public String name() {
		return " Find Name";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		for (Item item : tracker.findByName(name())) {
			System.out.println(String.format("%s %s",item.getName(), item.getId()));
		}
		return true;
	}

}
