package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficesTest {

    @Test
    public void add() {
        Citizens citizen = new Citizens("2f44a", "Petr Arsentev");
        PassportOffices office = new PassportOffices();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }
}