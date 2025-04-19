package org.knit.solutions.Task14;

interface FileSystemVisitor {
    void visit(File file);
    void visit(Folder folder);
    void visit(Shortcut shortcut);
}
