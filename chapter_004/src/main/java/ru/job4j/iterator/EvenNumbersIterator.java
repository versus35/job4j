package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Итератор для четных чисел.
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 05.12.2019.
 */

public class EvenNumbersIterator implements Iterator {
    /**
     * Обрабатываемый массив.
     */
    private int[] array;
    /**
     * Текущий индекс.
     */
    private int index;

    /**
     * Конструктор класса.
     *
     * @param array Обрабатываемый массив.
     */

    public EvenNumbersIterator(int[] array) {
        this.array = array;
        this.index = 0;

    }

    /**
     * Метод проверяет наличие следующего четного числа.
     *
     * @return Результат проверки.
     */

    @Override
    public boolean hasNext() {
        boolean hasNext = false;
//        int currentIndex = this.index;
//        while (currentIndex < array.length) {
//            if (this.array[currentIndex] % 2 == 0) {
//                hasNext = true;
//                break;
//            } else {
//                currentIndex++;
//            }
        if (index < array.length) {
            for (int i = index; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    index = i;
                    hasNext = true;
                    break;
                }
            }
        }
        return hasNext;
    }

    /**
     * Метод возвращает следующий элемент массива, содержащий четное число.
     *
     * @return Элемент массива.
     */

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return array[index++];
    }
}

