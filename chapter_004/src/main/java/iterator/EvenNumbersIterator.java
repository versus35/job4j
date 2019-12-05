package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator implements Iterator {
    private int[] array;
    private int index;

    public EvenNumbersIterator(int[] array) {
        this.array = array;
        this.index = 0;

    }

    @Override
    public boolean hasNext() {
        boolean hasNext = false;
        int currentIndex = this.index;
        while (currentIndex < array.length) {
            if (this.array[currentIndex] % 2 == 0) {
                hasNext = true;
                break;
            } else {
                currentIndex++;
            }
        }
        return hasNext;
    }

    @Override
    public Object next() {
        int numbers = 0;
        while (true) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            numbers = this.array[this.index];
            this.index++;
            if (numbers % 2 == 0) {
                break;
            }
        }
        return numbers;
    }
}
