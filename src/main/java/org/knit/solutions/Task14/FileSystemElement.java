package org.knit.solutions.Task14;

interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}
