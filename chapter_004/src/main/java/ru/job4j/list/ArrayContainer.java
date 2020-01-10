package ru.job4j.list;
/**
 * Реализация динамического контейнера.
 * @param <E> Тип данных, с которыми будет работать хранилище.
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 10.01.2020.
 */
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayContainer<E> implements Iterable<E> {
    private Object[] array;
    private int size;
    private final static int CONTAINER_SIZE = 10;
    private int modCount;

    /**
     * Конструктор, инициализирует хранилище с заданным размером 10;
     */
    public ArrayContainer() {
        array = new Object[CONTAINER_SIZE];
    }

    /**
     * Конструктор, инициализирует хранилище заданным размером.
     * @param size заданный размер.
     */
    public ArrayContainer(int size) {
        array = new Object[size];
    }

    /**
     * Метод увеличивет в 2 раза размер хранилища.
     */
    private void twoArraySize() {
        this.array = Arrays.copyOf(this.array, this.array.length * 2);
    }

    /**
     * Проверяет на наличие индекса в хранилище.
     * @param index проверяемый индекс.
     */
    public void checkIndexOutOfBounds(int index) {
        if (array.length < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /**
     * Метод добавляет элемент в хранилище.
     * Увеличивает счетчик изменений хранилища.
     * @param value объект, который добавляют в хранилище.
     */
    public void add(E value) {
        if (array.length < size + 1) {
            twoArraySize();
        }
        array[size++] = value;
        modCount++;
    }

    /**
     * Метод получает элемент по индексу.
     * @param index объекта.
     * @return объект под заданным индексом.
     */
    public E get(int index) {
        checkIndexOutOfBounds(index);
        return (E) array[index];
    }

    /**
     * Итератор типа <E> для обхода хранилища.
     *
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int position = 0;
            private int expectedMod = modCount;

            /**
             * Проверяет наличие элементов после указателя.
             * @return true - если есть элемент.
             *         false - если нет элемента.
             */
            @Override
            public boolean hasNext() {
                checkModCount();
                return position < size;
            }

            /**
             * Возвращает текущий элемент и переводит указатель.
             * @return текущий элемент под указателем.
             */
            @Override
            public E next() {
                checkModCount();
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (E) array[position++];
            }

            /**
             * Метод проверяет изменилось ли хранилище.
             */
            private void checkModCount() {
                if (expectedMod != modCount) {
                    throw new ConcurrentModificationException();
                }
            }
        };
    }
}
