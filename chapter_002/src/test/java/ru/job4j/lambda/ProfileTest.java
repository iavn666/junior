package ru.job4j.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfileTest {
    @Test
    public void client() {
        Address num = new Address("Perm","kompros",10,5);
        Profile rest = new Profile(num);
        List<Profile> exp = new ArrayList<>();
        exp.add(rest);
        List<Profile> result = new ArrayList<>();
        Profile res = new Profile(new Address("Perm","kompros",10,5));
        res.collect(result);
        assertThat(exp, is(result));
    }

}

