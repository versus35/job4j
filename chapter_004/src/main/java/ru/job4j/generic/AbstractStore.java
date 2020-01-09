package ru.job4j.generic;

import java.util.NoSuchElementException;

/**
 * Реализует методы для хранилища UserStore и RoleStore.
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 09.01.2020.
 */

public class AbstractStore<T extends Base> implements Store<T> {
    private SimpleArray<T> simpleArray = new SimpleArray<>();

    /**
     * Производит поиск в хранилище по id.
     *
     * @param id заданный id.
     * @return возвращает индекс объекта либо -1, если обьекта нет.
     */
    public int findIndexById(String id) {
        int index = -1;
        for (int i = 0; i < simpleArray.size; i++) {
            if (simpleArray.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean indexFound(int index) {
        return (index != -1);
    }

    /**
     * Добавляет объект в хранилище.
     *
     * @param model объект
     */

    @Override
    public void add(T model) {
        simpleArray.add(model);
    }

    /**
     * Вводит объект в хранилище на место объекта с заданным id.
     *
     * @param id    хаданный id.
     * @param model объект для замены.
     * @return true - если замена удалась и false - если замена не удалась.
     */

    @Override
    public boolean replace(String id, T model) {
        int index = findIndexById(id);
        if (indexFound(index)) {
            simpleArray.set(index, model);
            return true;
        }
        return false;
    }

    /**
     * Удаляет объект из хранилища по заданному id.
     *
     * @param id заданный id.
     * @return true - если замена удалась и false - если замена не удалась.
     */

    @Override
    public boolean delete(String id) {
        int index = findIndexById(id);
        if (indexFound(index)) {
            simpleArray.remove(index);
            return true;
        }
        return false;
    }

    /**
     * Находит элемент по id.
     *
     * @param id возвращаемого элемента.
     * @return объект с заданныь id.
     */

    @Override
    public T findById(String id) {
        int index = findIndexById(id);
        if (!indexFound(index)) {
            throw new NoSuchElementException();
        }
        return simpleArray.get(index);
    }
}
