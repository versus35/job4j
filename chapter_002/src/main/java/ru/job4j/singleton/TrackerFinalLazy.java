package ru.job4j.singleton;

import ru.job4j.tracker.Item;

public class TrackerFinalLazy {
	private TrackerFinalLazy() {
	}

	public static TrackerFinalLazy getInstance() {
		return Holder.INSTANCE;
	}

	public Item add(Item model) {
		return model;
	}

	private static final class Holder {
		private static final TrackerFinalLazy INSTANCE = new TrackerFinalLazy();
	}

	public static void main(String[] args) {
		TrackerFinalLazy tracker = TrackerFinalLazy.getInstance();
	}
}
