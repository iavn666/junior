package ru.job4j.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Profile {

    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(x -> x.getAddress()).distinct().collect(Collectors.toList());
    }



}


