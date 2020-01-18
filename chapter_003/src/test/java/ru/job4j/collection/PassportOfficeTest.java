package ru.job4j.collection;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class PassportOfficeTest {
    Map<String, Citizen> map = new HashMap<>();

    @Test
    public void whenGetPassport() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

}