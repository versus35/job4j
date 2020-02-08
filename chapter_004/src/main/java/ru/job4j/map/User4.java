package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User4 {

    private String name;
    private String lastName;

    public User4(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User4 user4 = (User4) o;
        return Objects.equals(name, user4.name) && Objects.equals(lastName, user4.lastName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    public static void main(String[] args) {

        User4 user = new User4("Vova", "Petrov");
        User4 user1 = new User4("Vova", "Petrov");
        Map<User4, Object> map = new HashMap<>();
        map.put(user, user);
        map.put(user1, user1);
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
    }
}
