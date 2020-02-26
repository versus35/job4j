package ru.job4j.tree;

import java.util.Optional;

/**
 * Реализация Tree.
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 26.02.2020.
 */
public interface SimpleTree<E extends Comparable<E>> {
    /**
     * Метод добавляет элемент в список подчиненных элементов.
     *
     * @param parent Главный элемент.
     * @param child  Подчиненный элемент.
     * @return Результат добавленя.
     */
    boolean add(E parent, E child);

    /**
     * Метод выполняет поиск элемента дерева.
     *
     * @param value Значение элемента.
     * @return Найденный элемент или пустой элемент.
     */
    Optional<Node<E>> findBy(E value);
}
