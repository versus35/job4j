package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PassportOffice {

    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (citizens != null) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        return this.citizens.keySet()
                .stream()
                .filter(x -> x.contains(passport))
                .findFirst().map(user -> citizens.get(passport))
                .orElse(null);
    }
}
