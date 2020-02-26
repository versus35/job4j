package ru.job4j.tree;

import java.util.*;

/**
 * Реализация Tree.
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 26.02.2020.
 */
public class Tree<E extends Comparable<E>> implements SimpleTree<E> {
    /**
     * Корневой элемент дерева.
     */
    private Node<E> root;
    /**
     * Тукущий размер дерева.
     */
    private int size;
    /**
     * Счетчик изменения дерева.
     */
    private int modCount;

    /**
     * Коструктор, создает дерево, содержащим переданное значение.
     *
     * @param element Значение элемента.
     */
    public Tree(E element) {
        this.root = new Node<>(element);
        this.size++;
    }

    /**
     * Метод создает элемент дерева и добавляет его в список подчиненных элементов.
     *
     * @param parent Главный элемент.
     * @param child  Подчиненный элемент.
     * @return Результат добавления.
     */
    @Override
    public boolean add(E parent, E child) {
        boolean added = false;
        Optional<Node<E>> findParent = findBy(parent);
        Optional<Node<E>> findChild = findBy(child);
        if (findParent.isPresent() && !findChild.isPresent()) {
            findParent.get().add(new Node(child));
            added = true;
        }
        return added;
    }

    /**
     * Метод выполняет поиск элемента дерева по значению.
     *
     * @param value Значение элемента.
     * @return Найденный элемент или пустой элемент.
     */
    @Override
    public Optional<Node<E>> findBy(E value) {
        Optional<Node<E>> rsl = Optional.empty();
        Queue<Node<E>> data = new LinkedList<>();
        data.offer(this.root);
        while (!data.isEmpty()) {
            Node<E> el = data.poll();
            if (el.eqValue(value)) {
                rsl = Optional.of(el);
                break;
            }
            for (Node<E> child : el.getValues()) {
                data.offer(child);
            }
        }
        return rsl;
    }

    public boolean isBinary() {
        boolean isBinary = true;
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            Optional<Node<E>> optional = this.findBy(it.next());
            if (optional.isPresent() && optional.get().getValues().size() > 2) {
                isBinary = false;
                break;
            }
        }
        return isBinary;
    }

    /**
     * Итератор для обхода дерева.
     *
     * @return Итератор.
     */
    @Override
    public Iterator<E> iterator() {
        /**
         * Список элементов текущего уровня и потомков текущего корневого элемента.
         */
        Queue<Node<E>> data = new LinkedList<>();
        data.offer(root);
        return new Iterator<E>() {
            /**
             * Проверяет наличие следующего элемента.
             * @return true если есть элемент,
             *         false если нет элемента.
             */
            @Override
            public boolean hasNext() {
                return !data.isEmpty();
            }

            /**
             * Возвращает следующее значение узла дерева.
             * @return Значение узла.
             */
            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                } else {
                    Node<E> el = data.poll();
                    for (Node<E> child : el.getValues()) {
                        data.offer(child);
                    }
                    return el.getValue();
                }
            }
        };
    }
}
