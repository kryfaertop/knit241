package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.Task15.ImageProxy;
import org.knit.solutions.Task15.RealImage;
import org.knit.solutions.Task15.Image;
import java.awt.*;

/*
Задача:
Создайте удаленную библиотеку изображений.

При запросе изображения оно загружается с сервера (имитация через задержку в коде).
Картинка хранится как объект класса RealImage.
Прокси-объект ImageProxy должен лениво загружать изображение и кэшировать его для повторного использования.
📌 Подсказка:
ImageProxy должен проверять, создан ли объект RealImage. Если нет — создавать его.
 */

@TaskDescription(taskNumber = 15, taskDescription = "Паттерн Прокси (Proxy)", href = "org/knit/solutions/taskExampleClasses/README.md")
public class Task15_Sol implements Solution {
    @Override
    public void execute() {
        System.out.println("Задача 15 запущена");
        Image img = new ImageProxy("cat.png");
        System.out.println("Первый вызов:");
        img.display(); // загрузка и показ

        System.out.println("Второй вызов:");
        img.display();

    }
}
