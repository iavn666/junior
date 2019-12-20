package ru.job4j.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


public class UserConvert {

    public static HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> states = new HashMap<Integer, User>();
        for (User users : list) {
            states.put(users.getId(), users);

        }
        return states;
    }


}
