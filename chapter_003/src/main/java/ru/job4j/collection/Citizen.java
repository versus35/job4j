package ru.job4j.collection;

import java.util.Objects;

public class Citizen {

    private String passport;
    private String userName;

    public Citizen() {

    }

    public String getPassport() {
        return passport;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Citizen citizen = (Citizen) o;
        return passport.equals(citizen.passport) &&
                userName.equals(citizen.userName);
    }

    @Override
    public int hashCode() {
        return this.getPassport().hashCode() + this.getUserName().hashCode();
    }

    public Citizen(String passport, String userName) {
        this.passport = passport;
        this.userName = userName;
    }
}
