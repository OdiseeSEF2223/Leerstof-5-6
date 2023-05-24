package org.example;

// implements is zoals extends maar voor Interfaces
// je kan meer interfaces implementeren
public class Human implements ISoundProducer, IEater{
    @Override
    public void makeSound() {
        System.out.println("Spreek");
    }

    @Override
    public void eat() {

    }
}
