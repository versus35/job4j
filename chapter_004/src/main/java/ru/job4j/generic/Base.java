package ru.job4j.generic;

/**
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 09.01.2020.
 */
public abstract class Base {
    private final String id;

    public String getId() {
        return id;
    }

    protected Base(String id) {
        this.id = id;
    }
}
