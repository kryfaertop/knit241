package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.Task13.*;

/*
Вы разрабатываете систему управления "умным домом", где пользователь может выполнять различные команды, такие как включение/выключение света, управление телевизором и кондиционером.

Требуется:
Создать интерфейс Command, который определяет метод execute().
Реализовать классы команд:
LightOnCommand – включает свет.
LightOffCommand – выключает свет.
TVOnCommand – включает телевизор.
TVOffCommand – выключает телевизор.
Создать класс RemoteControl, который хранит команду и позволяет её выполнить.
Реализовать механизм отмены последней команды (undo).

Пример работы:
Пользователь нажимает кнопку "Включить свет" – выполняется LightOnCommand.
Затем нажимает "Выключить телевизор" – выполняется TVOffCommand.
Пользователь нажимает "Отменить последнюю команду" – телевизор снова включается.
Дополнительно: Реализуйте поддержку макрокоманд (например, кнопка "Спокойной ночи" выключает все приборы разом).
 */

@TaskDescription(taskNumber = 13, taskDescription = "Паттерн Command (Команда)", href = "org/knit/solutions/taskExampleClasses/README.md")
public class Task13_Sol implements Solution {
    @Override
    public void execute() {
        System.out.println("Задача 13 запущена");
        Light light = new Light();
        TV tv = new TV();

        Command lightOn = new LightOnCommand(light);
        Command tvOff = new TVOffCommand(tv);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(tvOff);
        remote.pressButton();

        remote.pressUndo();

        // Макрокоманда "Спокойной ночи"
        Command[] nightCommands = {new LightOffCommand(light), new TVOffCommand(tv)};
        Command nightMacro = new MacroCommand(nightCommands);

        remote.setCommand(nightMacro);
        remote.pressButton();
        remote.pressUndo();
    }
}
