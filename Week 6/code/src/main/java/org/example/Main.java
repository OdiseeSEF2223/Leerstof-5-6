package org.example;

public class Main {
    public static void main(String[] args) {

        Human h = new Human();
        h.makeSound();

        ISoundProducer sp = h;
    }
}