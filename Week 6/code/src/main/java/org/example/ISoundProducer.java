package org.example;

public interface ISoundProducer {
    // private variabelen kan je hier niet zetten
    //private String name;

    // publieke methoden kunnen wel (zonder implementatie)
    public void makeSound();

    // ook dit gaat niet werken -> enkel public zaken kan je toevoegen
    //private void makeSound2();
}

