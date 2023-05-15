package org.example;

public class Hond extends SoundProducer {

    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Woef");
    }
}
