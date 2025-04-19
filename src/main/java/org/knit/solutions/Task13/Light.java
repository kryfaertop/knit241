package org.knit.solutions.Task13;

public class Light {
    private boolean on = false;

    public void on() {
        on = true;
        System.out.println("Свет включен");
    }

    public void off() {
        on = false;
        System.out.println("Свет выключен");
    }
}
