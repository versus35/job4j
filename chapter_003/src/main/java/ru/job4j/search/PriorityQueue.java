package ru.job4j.search;

import java.util.LinkedList;
import java.util.ListIterator;

public class PriorityQueue {
	private LinkedList<Task> tasks = new LinkedList<>();

	public void put(Task task) {
		if (this.tasks.size() == 0) {
			this.tasks.add(task);
		} else {
			for (int i = 0; i != this.tasks.size(); i++) {
				if (this.tasks.get(i).getPriority() >= task.getPriority()) {
					this.tasks.add(i, task);
					break;
				}
			}
		}
	}

	public Task take() {
		return this.tasks.poll();
	}
}
