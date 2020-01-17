package ru.job4j.set;
/**
 * Простой Set на базе ArrayContainer.
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 17.01.2020.
 */

import ru.job4j.list.ArrayContainer;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleSet<E> implements Iterable<E> {
    private ArrayContainer<E> list = new ArrayContainer<>();

    /**
     * Метод добаляет элемент в хранилище
     * Соблюдается условие, дубликатов нет.
     *
     * @param e добавленный элемент.
     * @return добавленный элемент.
     */

    public void add(E e) {
        if (!contains(e)) {
            list.add(e);
        }
    }

    /**
     * Метод проверяет содержит ли хранилище дубликат элемента.
     *
     * @param e проверяемый элемент.
     * @return true - если содержит,
     * false - если не содержит.
     */

    public boolean contains(E e) {
        for (E element : list) {
            if (element.equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Итератор для обхода хранилища.
     */

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}
