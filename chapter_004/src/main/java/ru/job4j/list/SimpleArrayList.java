package ru.job4j.list;

/**
 * Package for list.
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 10.01.2020.
 */

public class SimpleArrayList<E> {
    private int size;
    private Node<E> first;

    /**
     * Метод вставляет в начало списка данные.
     */
    public void add(E data) {
        Node<E> newLink = new Node<>(data);
        newLink.next = this.first;
        this.first = newLink;
        this.size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Реализовать метод удаления первого элемент в списке.
     *
     * @param
     */
    public E delete() {
        if (this.size == 0) {
            return null;
        }
        E temp = first.data;
        first = first.next;
        size--;
        return temp;
    }

    /**
     * Метод получения элемента по индексу.
     */
    public E get(int index) {
        Node<E> result = this.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.data;
    }

    /**
     * Метод получения размера коллекции.
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Класс предназначен для хранения данных.
     */
    private static class Node<E> {

        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }
}
