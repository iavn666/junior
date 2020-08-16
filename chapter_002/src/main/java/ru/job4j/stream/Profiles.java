package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {


    List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(profile -> profile.getAddress()).
                sorted(new AddresCompar()).distinct().collect(Collectors.toList());

    }


}


