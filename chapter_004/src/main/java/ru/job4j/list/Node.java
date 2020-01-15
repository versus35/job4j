package ru.job4j.list;
/**
 * Определение цикличности заданного связанного списка.
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 15.01.2020.
 */
public class Node<T> {
    T value;
    Node<T> next;

    /**
     * Корструктор устанавливает значение элемента.
     * @param value значение элемента.
     */
    public Node(T value) {
        this.value = value;
    }

    /**
     * Метод проверяет зацикленности в связанном списке.
     * @param first первый элемент списка.
     * @return true - если есть зацикленность,
     *        false - если нету.
     */
    public static boolean hashCycle(Node first) {
        boolean result = false;
        Node slow = first;
        Node fast = first;

        while (slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                result = true;
                break;
            }
        }
        return result;
    }
}
