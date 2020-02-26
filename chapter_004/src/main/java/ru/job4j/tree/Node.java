package ru.job4j.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 26.02.2020.
 */

public class Node<E extends Comparable<E>> {
    /**
     * Список подчиненных эелементов.
     */
    private final List<Node<E>> children = new ArrayList<>();
    /**
     * Значение элемента.
     */
    private final E value;

    /**
     * Конструктор создает элемент дерева с указанным значением.
     *
     * @param value Значение элемента.
     */
    public Node(E value) {
        this.value = value;
    }

    /**
     * Метод добаляет элемент в список подчиненных элементов
     *
     * @param child Подчиненный элемент.
     */
    public void add(Node<E> child) {
        this.children.add(child);
    }

    /**
     * Метод возвращает список подчиненных элементов.
     *
     * @return элементы списка.
     */
    public List<Node<E>> getValues() {
        return this.children;
    }

    /**
     * Метод выполняет сравнение значения элемента с переданным значением.
     *
     * @param value Переданное значение.
     * @return Результат сравнения.
     */
    public boolean eqValue(E value) {
        return this.value.compareTo(value) == 0;
    }

    /**
     * Метод возвращает список элементов.
     *
     * @return Элементы списка.
     */
    public E getValue() {
        return this.value;
    }

    /**
     * Метод возвращает хэш-код по значению элемента.
     *
     * @return Хэш-код.
     */
    public int hashCod() {
        return this.value.hashCode();
    }
}
