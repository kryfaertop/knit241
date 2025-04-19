package org.knit.solutions.Task15;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("Загрузка " + filename + " с сервера...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }

    public void display() {
        System.out.println("Показ изображения: " + filename);
    }
}
