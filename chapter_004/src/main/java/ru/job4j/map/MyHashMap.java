package ru.job4j.map;
/**
 * Реализация собственной карты.
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 08.02.2020.
 */

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class MyHashMap<K, V> implements Iterable<K> {

    private Node<K, V>[] hashTable;
    private int size = 0;
    private int modCount;
    private int threshold;
    private static final double LOAD_FACTOR = 0.75;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    /**
     * Инициализация хранилища размером 16.
     */
    public MyHashMap() {
        this.hashTable = new Node[DEFAULT_INITIAL_CAPACITY];
        reDouble();
    }

    /**
     * Конструктор, инициализируется заданным размером.
     *
     * @return заданный размер.
     */
    public MyHashMap(int size) {
        this.hashTable = new Node[size];
    }

    public int capacity() {
        return hashTable.length;
    }

    /**
     * Вычисление размеров таблицы.
     */
    private void reDouble() {
        threshold = (int) ((double) hashTable.length * LOAD_FACTOR);
    }

    /**
     * Вычисляет хэш модуль ключа, в зависимости от размера таблицы.
     *
     * @param key заданный модуль ключа.
     * @return модуль ключа.
     */
    private int hash(Object key) {
//        int h = key.hashCode();
//        return (h) ^ (h >>> 16);
        return key.hashCode() % hashTable.length;
    }

    /**
     * Метод определения индекс в таблице.
     *
     * @param hash   хэ модуль ключа.
     * @param length размер таблицы.
     * @return позиция в таблице.
     */
    private int indexFor(int hash, int length) {
        return (length - 1) & hash;
    }

    /**
     * Метод увеличения размеров таблицы.
     */
    private void resize() {
        Node<K, V>[] newNode = new Node[this.hashTable.length * 2];
//        for (int i = 0; i < hashTable.length; i++) {
//            int newIndex = indexFor(hash(this.hashTable[i].getKey()), newNode.length);
//            newNode[newIndex] = this.hashTable[i];
//        }
        for (Node<K, V> data : this.hashTable) {
            if (data != null) {
                int i = hash((K) data.key);
                newNode[i] = data;
            }
        }
        this.hashTable = newNode;
    }

    /**
     * Метод добавления пары в таблицу.
     *
     * @param key   ключ.
     * @param value значение.
     * @return добавленный элемент.
     */
    public boolean insert(K key, V value) {
        boolean inserted = false;
        if (key != null) {
            int index = indexFor(hash(key), this.hashTable.length);
            if (this.hashTable[index] == null) {
                this.hashTable[index] = new Node<>(key, value);
                inserted = true;
                this.modCount++;
                this.size++;
                if (size++ == threshold) {
                    resize();
                }
            }
        }
        return inserted;
    }

    /**
     * Метод проверяет содержит ли ключ в таблице.
     *
     * @param key ключ.
     * @return значение ключа, если содержится в таблице.
     */
    public V get(K key) {
        Node<K, V> elements = this.hashTable[indexFor(hash(key), this.hashTable.length)];
        return (elements == null ? null : elements.getValues());

    }

    /**
     * Метод удаляет пару ключ - значение из таблицы.
     *
     * @param key ключ удаляемого элемента.
     * @return true - если ключ удалился из таблицы.
     * false - если не удалился.
     */
    public boolean delete(K key) {
        boolean delete = false;
        int index = indexFor(hash(key), this.hashTable.length);

        if (this.hashTable[index] != null) {
            this.hashTable[index] = null;
            delete = true;
            this.modCount++;
            this.size--;
        }
        return delete;
    }

    /**
     * Итератор для обхода хранилища.
     * @return итератор.
     */

    @Override
    public Iterator<K> iterator() {
        return new Iterator() {
            private int current;
            private int position;
            private int expectedMod = modCount;

            /**
             *
             * @return true - если есть следующий элемент.
             *         false -если нет элемента.
             */
            @Override
            public boolean hasNext() {
                checkModCount();
                return current < size;
            }

            /**
             * Возвращает следующий элемент за указателем и переводит курсор.
             * @return следующий элемент.
             */
            @Override
            public K next() {
                checkModCount();
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                K key = null;
                for (; position < hashTable.length; position++) {
                    if (hashTable[position] != null) {
                        current++;
                        key = hashTable[position].getKey();
                        break;
                    }
                }
                return key;
            }

            /**
             * Проверяет изменения коллекции.
             */
            private void checkModCount() {
                if (expectedMod != modCount) {
                    throw new ConcurrentModificationException();
                }
            }
        };
    }

    /**
     * Класс описывает описывает объекты, добавленные в таблицу.
     * @param <K> ключ.
     * @param <V> значение.
     */
    private class Node<K, V> {
        private K key;
        private V values;

        public Node(K key, V value) {
            this.key = key;
            this.values = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValues() {
            return values;
        }

        public void setValues(V values) {
            this.values = values;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) {
//                return true;
//            }
//            if (o == null || getClass() != o.getClass()) {
//                return false;
//            }
//            Node<?, ?> node = (Node<?, ?>) o;
//            return Objects.equals(key, node.key) && Objects.equals(values, node.values);
//        }
//
//        @Override
//        public int hashCode() {
//            int result = 17;
//            result = result * 31 + key.hashCode();
//            result = result * 31 + values.hashCode();
//            return result;
//        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", values=" + values +
                    '}';
        }
    }


}
