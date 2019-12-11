package generics;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleArray<T> implements Iterable<T> {
    private Object[] array;
    private int position;

    public SimpleArray(int size) {
        this.array = new Object[size];
        this.position = 0;
    }

    public SimpleArray() {
        array = new Object[10];

    }

    public void checkIndexPosition(int position) {
        if (array.length < position) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(T model) {
        this.array[position++] = model;
    }

    public int set(int position, T model) {
        checkIndexPosition(position);
        array[position] = model;
        return position;
    }

    public int remove(int index) {
        if (index > position) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index < position) {
            for (int i = 0; i < position; i++) {
                this.array[i] = this.array[i + 1];
            }
            this.array[position--] = null;
        }
        return index;
    }

    public T get(int index) {
        if (index >= position) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) this.array[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < position;
            }

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
