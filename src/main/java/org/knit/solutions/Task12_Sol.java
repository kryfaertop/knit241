package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.Task12.Caretaker;
import org.knit.solutions.Task12.TextEditor;

/*
Разработайте систему, позволяющую сохранять состояния текста в редакторе и откатывать изменения назад.

Требуется:
Создать класс TextEditor, который содержит текущий текст документа.
Создать класс Memento, который будет хранить снимок состояния текста.
Реализовать Caretaker, который управляет историей изменений (например, стек сохранённых состояний).
Реализовать методы saveState() и undo() для сохранения и отката изменений.

Пример работы:
Пользователь вводит текст "Hello, world!".
Он сохраняет текущее состояние.
Затем добавляет " How are you?".
Нажимает "Отменить" и возвращается к "Hello, world!".
Дополнительно: Реализуйте возможность нескольких уровней отката.
 */

@TaskDescription(taskNumber = 12, taskDescription = "Паттерн Memento (Хранитель)", href = "org/knit/solutions/taskExampleClasses/README.md")
public class Task12_Sol implements Solution {
    @Override
    public void execute() {
        System.out.println("Задача 12 запущена");
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.setText("Hello, world!");
        caretaker.save(editor.saveState());

        editor.setText("Hello, world! How are you?");
        caretaker.save(editor.saveState());

        editor.setText("Hello, world! How are you? I'm fine.");

        System.out.println(editor.getText()); // Текущий текст

        // Откат
        editor.restoreState(caretaker.undo());
        System.out.println(editor.getText());

        editor.restoreState(caretaker.undo());
        System.out.println(editor.getText());
    }
}
