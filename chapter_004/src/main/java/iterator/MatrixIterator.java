package iterator;


import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * Итератор для двумерного массива.
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 05.12.2019.
 */

public class MatrixIterator implements Iterator {
    /**
     * Обрабатываемый массив.
     */
    private int[][] array;
    /**
     * Текущая колонка массива.
     */
    private int currentColumn;
    /**
     * Текущая строка массива.
     */
    private int currentRow;
    /**
     * Количество элементов массива.
     */
    private long size;
    /**
     * Текущий индекс.
     */
    private int index;

    /**
     * Конструктор массива.
     * @param array Обрабатываемый массивю
     */
    public MatrixIterator(int[][] array) {
        this.array = array;
        this.currentColumn = 0;
        this.currentRow = 0;
        this.size = Arrays.stream(array).flatMapToInt(x -> Arrays.stream(x)).count();
        this.index = 0;
    }

    /**
     * Метод проверяет, есть следующий элемент в массиве.
     * @return Результат проверки.
     */

    @Override
    public boolean hasNext() {
        return this.index < this.size;
    }

    /**
     * Метод возвращает следующий элемент.
     * @return Элемент массива.
     */

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int elem = array[currentRow][currentColumn];
        if (array[currentRow].length == currentColumn +1) {
            currentRow++;
            currentColumn = 0;
        } else {
            currentColumn++;
        }
        this.index++;
        return elem;
    }
}