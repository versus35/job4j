package ru.job4j.search;

import java.util.LinkedList;
import java.util.ListIterator;

public class PriorityQueue {
	private LinkedList<Task> tasks = new LinkedList<>();

	public void put(Task task) {
		int count = 0;//tasks.size();
			for (Task i : tasks) {
				if (task.getPriority() >= i.getPriority()) {
					count++;
					//break;
				}
			}
		tasks.add(count, task);
	}


	public Task take() {
		return this.tasks.poll();
	}
}
