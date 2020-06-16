package ru.job4j.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Profile {

    private Address address;

    public Profile (Address address) {
        this.address = address;
    }

    List<Address> collect(List<Profile> profiles) {
        Stream num = profiles.stream();
         return num.map(x-> new Profile(address)).collect(Collectors.toList());

    }

}


