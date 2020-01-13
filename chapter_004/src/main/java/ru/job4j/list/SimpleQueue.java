package ru.job4j.list;

public class SimpleQueue<T>{

    private SimpleListStack<T> first;
    private SimpleListStack<T> second;

    public SimpleQueue() {
        this.first = new SimpleListStack<>();
        this.second = new SimpleListStack<>();
    }

    public boolean isEmpty() {
        if (second.isEmpty && first.isEmpty) {
            return true;
        }
        return false;
    }

    public void push(T data) {
        this.first.push(data);
    }

    public T poll() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.poll());
            }
        }
        return second.poll();
    }
}
