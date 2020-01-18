package ru.job4j.collection;

import java.util.Objects;

public class Order {
    String number;
    String name;

    public Order(String number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Order{" + "number='" + number + '\'' + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return number.equals(order.number) && name.equals(order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
