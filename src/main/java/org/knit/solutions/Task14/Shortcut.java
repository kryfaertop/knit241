package org.knit.solutions.Task14;

public class Shortcut implements FileSystemElement {
    String name;
    FileSystemElement target;

    public Shortcut(String name, FileSystemElement target) {
        this.name = name;
        this.target = target;
    }

    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
