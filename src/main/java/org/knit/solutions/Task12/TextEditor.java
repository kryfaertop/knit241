package org.knit.solutions.Task12;

public class TextEditor {
    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento saveState() {
        return new Memento(text);
    }

    public void restoreState(Memento memento) {
        this.text = memento.getState();
    }
}
