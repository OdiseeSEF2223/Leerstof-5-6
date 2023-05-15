package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        List<SoundProducer> soundproducers = new ArrayList();
        soundproducers.add(new SoundProducer());
        soundproducers.add(new Mens());
        soundproducers.add(new Hond());
        soundproducers.add(new Kat());

        for(SoundProducer sp: soundproducers){
            sp.makeSound();
        }
    }
}