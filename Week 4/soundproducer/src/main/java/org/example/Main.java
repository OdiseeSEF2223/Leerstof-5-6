package org.example;

public class Main {
    public static void main(String[] args) {
        SoundProducer producer = new SoundProducer();
        Human mens = new Human();
        Kat kat = new Kat();
        Hond hond = new Hond();

        producer.makeSound();
        mens.makeSound();
        kat.makeSound();
        hond.makeSound();

        // Use inheritance
        System.out.println("With inheritance");
        SoundProducer[] producers = new SoundProducer[]{
                new SoundProducer(),
                new Hond(),
                new Human(),
                new Kat()
        };

        for(SoundProducer p: producers){
            p.makeSound();
        }
    }
}