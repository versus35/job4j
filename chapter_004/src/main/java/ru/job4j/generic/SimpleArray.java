package ru.job4j.generic;

import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * @param <T> Тип данных с которыми будет работать хранилище.
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 09.01.2020.
 */
public class SimpleArray<T> implements Iterable<T> {
    public int size;
    private Object[] array;
    private int position;

    /**
     * Корструктор, инициализирует хранилище, заданного размера.
     * @param size заданный размер хранилища.
     */
    public SimpleArray(int size) {
        this.array = new Object[size];
        this.position = 0;
    }

    /**
     * Конструктор, инициализирует хранилище размером 10.
     */

    public SimpleArray() {
        array = new Object[10];
    }

    /**
     * Проверяет на наличие индекса в хранилище.
     * @param position проверяемый индекс.
     */

    public void checkIndexPosition(int position) {
        if (array.length < position) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /**
     * Добавление элемента в хранилище.
     * @param model объект, который нужно добавить в хранилище.
     */

    public void add(T model) {
        this.array[position++] = model;
    }

    /**
     *Заменяет элемент в хранилище.
     * @param position индекс заменяемого элемента.
     * @param model объект, который помещаем в хранилище на место заменяемого элемента.
     *
     */

    public int set(int position, T model) {
        checkIndexPosition(position);
        array[position] = model;
        return position;
    }

    /**
     * Удаляет элемент в хранилище со сдвигом.
     * @param index индекс удаляемого элемента.
     */

    public void remove(int index) {
        if (index > position) {
            throw new ArrayIndexOutOfBoundsException();
        }
      //  if (index < position) {
//            for (int i = 0; i < position; i++) {
//                this.array[i] = this.array[i + 1];
//            }
//            this.array[position--] = null;
            System.arraycopy(array, position + 1, array, position, array.length - position -1);
        }
       // return index;
   // }

    /**
     * Возвращает элемент из хранилища.
     * @param index индекс требуемого элемента.
     * @return объект под заданным индексом.
     */

    public T get(int index) {
        if (index >= position) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) this.array[index];
    }

    /**
     * Итератор типа <T> для обхода хранилища.
     *
     */

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            /**
             * Проверяет наличие элементов после указателя.
             * @return true - если после указателя есть элементы, false - если после указателя нет элементов.
             */
            @Override
            public boolean hasNext() {
                return index < position;
            }

            /**
             * Возвращает элемент и переводит указатель.
             * @return текущий элемент под указателем.
             */

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) array[index++];
            }
        };
    }
}
