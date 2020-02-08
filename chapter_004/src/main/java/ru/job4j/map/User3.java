package ru.job4j.map;

//import java.awt.datatransfer.SystemFlavorMap;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//
//public class User3 {
//    private String name;
//    private String lastName;
//
//    public User3(String name, String lastName) {
//        this.name = name;
//        this.lastName = lastName;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        User3 user3 = (User3) o;
//        if (!name.equals(user3.name)) {
//            return false;
//        }
//        if (!lastName.equals(user3.lastName)) {
//            return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//
//        User3 user = new User3("Vova", "Petrov");
//        User3 user1 = new User3("Vova", "Petrov");
//
//        Map<User3, Object> map = new HashMap<>();
//        map.put(user, user);
//        map.put(user1, user);
//
//        System.out.println(user.hashCode());
//        System.out.println(user1.hashCode());
//        System.out.println(user1.equals(user));
//
//    }
//}
