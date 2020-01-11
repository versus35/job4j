package ru.job4j.list;
/**
 * Реализиция хранилища для связного списка.
 *
 * @param <E> тип данных с которым работает хранилище.
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 11.01.2020.
 */

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Container<E> implements Iterable<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;
    private int modCount;

    /**
     * Итератор для обхода хранилища.
     * @return Итератор.
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> count = first;
            private int expectedMod = modCount;

            /**
             * Метод проверяет изменение хранилища.
             */
            private void checkModCount() {
                if (expectedMod != modCount) {
                    throw new ConcurrentModificationException();
                }
            }

            /**
             * Метод проверяет наличие следующего элемента.
             * @return true - если есть следующий элемент.
             *         false - если нету.
             */
            @Override
            public boolean hasNext() {
                checkModCount();
                return (count != null);
            }

            /**
             * Метод возвращает следующий объект.
             * @return объект или exception.
             */
            @Override
            public E next() {
                checkModCount();
                E result = first.data;
                first = first.next;
                return result;
            }
        };
    }
    public int  getSize() {
        return this.size;
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }

    /**
     * Метод добавляет элемент в хранилище.
     * @param element добавляемый объект.
     */
    public void add(E element) {
        Node<E> node = new Node<E>(element);
        if (this.first == null) {
            this.first = node;
        } else {
            this.last.next = node;
        }
        this.last = node;
        this.size++;
        this.modCount++;
    }

   public E delete() {
       E deleted = null;
       if (size > 0) {
           deleted = this.first.data;
           this.first = this.first.next;
           this.size--;
       }
       return deleted;
    }

    /**
     * Метод возвращает элемент по индексу.
     * @param index возвращаемого элемента.
     * @return найденный элемент.
     */
    public E get(int index) {
        Node<E> result = this.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.data;
    }

}
