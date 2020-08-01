package ru.job4j.search;

public class Persons {
    private String name;
    private String surname;
    private String phone;
    private String address;

    public Persons (String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }


}
