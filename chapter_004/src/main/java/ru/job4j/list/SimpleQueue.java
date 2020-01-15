package ru.job4j.list;

public class SimpleQueue<T> {

    private SimpleListStack<T> first = new SimpleListStack<>();
    private SimpleListStack<T> second = new SimpleListStack<>();


    public boolean isEmpty() {
        return (second.isEmpty && first.isEmpty) ? true : false;

    }

    public void push(T data) {
        this.first.push(data);
    }

    public T poll() {
        // if (second.isEmpty()) {
        while (!first.isEmpty()) {
            second.push(first.poll());
        }
        return second.poll();
    }
}
