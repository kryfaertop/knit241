package org.knit.solutions.Task13;

public class TV {
    private boolean on = false;

    public void on() {
        on = true;
        System.out.println("Телевизор включен");
    }

    public void off() {
        on = false;
        System.out.println("Телевизор выключен");
    }
}
