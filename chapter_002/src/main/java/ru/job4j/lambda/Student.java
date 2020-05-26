package ru.job4j.lambda;

public class Student {
    private int score;
    private String surname;

    public Student (int score, String surname) {
        this.score = score;
        this.surname = surname;
    }
     public int getScore() {
        return score;
     }

     public String getSurname() {
        return surname;
     }

     public void setScore (int score) {
        this.score = score;
     }

    @Override
    public String toString() {
        return "{" +
                "name='" + surname + '\'' +
                ", size=" + score +
                '}';
    }
}
