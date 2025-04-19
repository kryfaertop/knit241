package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.Task14.File;
import org.knit.solutions.Task14.Folder;
import org.knit.solutions.Task14.Shortcut;
import org.knit.solutions.Task14.SizeAnalyzer;
import org.knit.solutions.Task14.VirusScanner;



/*
Задача:
Создайте систему управления файловыми объектами.
Есть три типа файловых объектов:

Файлы,
Папки,
Ссылки (ярлыки).
Требуется реализовать два посетителя:

Сканер вирусов, который проверяет каждый файл на наличие вирусов.
Анализатор размера, который подсчитывает общий размер файлов (ссылки не учитываются).
📌 Подсказка:
Каждый файл, папка и ссылка должны реализовывать интерфейс FileSystemElement. В accept() методе вызывается соответствующий метод визитера.
 */

@TaskDescription(taskNumber = 14, taskDescription = "Паттерн Визитер (Visitor)", href = "org/knit/solutions/taskExampleClasses/README.md")
public class Task14_Sol implements Solution {
    @Override
    public void execute() {
        System.out.println("Задача 14 запущена");
        File file1 = new File("doc.txt", 100);
        File file2 = new File("photo.jpg", 2000);
        Folder folder = new Folder("Documents");
        folder.add(file1);
        folder.add(file2);
        Shortcut shortcut = new Shortcut("doc_link", file1);
        folder.add(shortcut);

        VirusScanner scanner = new VirusScanner();
        folder.accept(scanner);

        SizeAnalyzer analyzer = new SizeAnalyzer();
        folder.accept(analyzer);
        System.out.println("Общий размер файлов: " + analyzer.getTotalSize());
    }
}