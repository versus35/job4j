package ru.job4j.map;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class User {

    private String name;
    private String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }


    public static void main(String[] args) {

        User user = new User("Vova", "Petrov");
        User user1 = new User("Oleg", "Ivanov");

        Map<User, Object> map = new HashMap<>();
        map.put(user, 123);
        map.put(user1, 234);
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());

    }
}
