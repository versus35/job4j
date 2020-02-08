package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User1 {
    private String name;
    private String lastName;


    @Override
    public int hashCode() {
        return this.name.hashCode() + this.lastName.hashCode();
    }

    public User1(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public static void main(String[] args) {

        User1 user = new User1("Vova", "Petrov");
        User1 user1 = new User1("Vova", "Petrov");

        Map<User1, Object> map = new HashMap<>();
        map.put(user, user);
        map.put(user1, user);
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());

    }
}
