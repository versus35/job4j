package ru.job4j.search;

import java.util.LinkedList;
import java.util.ListIterator;

public class PriorityQueue {
	private LinkedList<Task> tasks = new LinkedList<>();

	public void put(Task task) {
		var count = 0;
			for (Task i : tasks) {
				if (task.getPriority() >= i.getPriority()) {
					count++;

				}
			}
		tasks.add(count, task);
	}


	public Task take() {
		return this.tasks.poll();
	}
}
