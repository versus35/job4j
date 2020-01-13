package ru.job4j.list;
/**
 * Реализация стека.
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 12.01.2020.
 */

import java.util.LinkedList;

public class SimpleListStack<T> {
    private SimpleArrayList<T> list;

    public SimpleListStack() {
        this.list = new SimpleArrayList<>();
    }

    /**
     * Метод вставки элемента.
     *
     * @param data добавляемый объект.
     */
    public void push(T data) {
        list.add(data);
    }

    /**
     * Метод удаляет последний вставленный элемент.
     *
     * @return удаляемый элемент.
     */
    public T poll() {
        return list.delete();
    }

//    private static class Node<T> {
//        private T data;
//        private Node<T> next;
//        private Node<T> first;
//
//        public Node(T data) {
//            this.data = data;
//        }
//
//        /**
//         * Метод для push операции.
//         * @param data добавляемый элемент.
//         */
//        public void addFirst(T data) {
//            Node<T> newFirst = new Node<>(data);
//            newFirst.next = first;
//            first = newFirst;
//        }
//
//        /**
//         * Метод для poll операции.
//         * @return удаляемый элемент.
//         */
//        public T removeFirst() {
//            Node<T> oldFirst = first;
//            first = first.next;
//            return oldFirst.data;
//        }
//    }
}
