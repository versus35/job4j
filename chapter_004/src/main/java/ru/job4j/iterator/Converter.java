package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Обработка итератора, содержащего другие итераторы.
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 05.12.2019.
 */

public class Converter {
    /**
     * Метод возвращает последовательность вложенных итераторов.
     *
     * @param it Обрабатываемый итератор.
     * @return Последовательность данных.
     */
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {
            Iterator<Integer> iterator = null;

            /**
             * Метод проверяет наличие следующего элемента итератора.
             * @return Результат проверки.
             */

            @Override
            public boolean hasNext() {
                if (iterator == null || (!iterator.hasNext())) {
                    while (it.hasNext()) {
                        iterator = it.next();
                        if (iterator.hasNext()) {
                            break;
                        }
                    }
                }
                return iterator.hasNext();
            }

            /**
             * Метод возвращает следующий элемент итератора.
             * @return Элемент итератора.
             */

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return iterator.next();
            }

        };
    }
}

