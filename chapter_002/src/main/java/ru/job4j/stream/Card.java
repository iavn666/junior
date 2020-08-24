package ru.job4j.stream;

import ru.job4j.my.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public enum Suit {
        Diamonds, Hearts, Spades, Clubs
    }

    public enum Value {
        V_6, V_7, V_8
    }

    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();
        List<Suit> s = Stream.of(Suit.values()).collect(Collectors.toList());
        List<Value> v = Stream.of(Value.values()).collect(Collectors.toList());



       // Напишите метод main, в котором генерируется колода карт.

       // Чтобы получить поток из перечисления, нужно использовать метод

       // Stream.of(Suit.values())
    }

}