package org.knit.solutions.Task14;

public class VirusScanner implements FileSystemVisitor {
    public void visit(File file) {
        System.out.println("Сканирую файл: " + file.name + " на вирусы...");
    }
    public void visit(Folder folder) {
        System.out.println("Проверяю папку: " + folder.name);
    }
    public void visit(Shortcut shortcut) {
        System.out.println("Проверяю ярлык: " + shortcut.name);
    }
}
