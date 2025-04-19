package org.knit.solutions.Task14;

public class File implements FileSystemElement {
    String name;
    int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
