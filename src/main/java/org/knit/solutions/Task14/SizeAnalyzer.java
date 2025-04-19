package org.knit.solutions.Task14;

public class SizeAnalyzer implements FileSystemVisitor {
    private int totalSize = 0;

    public int getTotalSize() {
        return totalSize;
    }

    public void visit(File file) {
        totalSize += file.size;
    }
    public void visit(Folder folder) {
        // ничего не делаем
    }
    public void visit(Shortcut shortcut) {
        // ссылки не учитываем
    }
}
