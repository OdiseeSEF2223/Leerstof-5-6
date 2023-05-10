package org.example;

public class Wasmachine {

    private State state = State.UIT;
    private Programma programma;

    public boolean isAan(){
        return state != State.UIT;
    }

    public void zetAan() {
        state = State.AAN;
    }

    public void zetUit() {
        state = State.UIT;
    }

    public void start(Programma p) {
        if(isAan() && !isGestart()) {
            state = State.GESTART;
            programma = p;
        }
    }

    public boolean isGestart() {
        return state==State.GESTART;
    }

    public Programma getProgramma() {
        return programma;
    }
}
