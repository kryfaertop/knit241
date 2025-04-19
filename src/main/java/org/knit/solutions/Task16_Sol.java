package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.Task16.Glyph;
import org.knit.solutions.Task16.GlyphFactory;

/*
Задача:
Реализуйте систему отображения символов текста на экране.

Каждый символ (Character) имеет внутреннее состояние (код символа) и внешнее состояние (координаты x, y и стиль).
Используйте Фабрику приспособленцев, чтобы повторно использовать объекты символов и уменьшить количество объектов, создаваемых в системе.
📌 Подсказка:
Внешнее состояние передается в метод render(), а внутреннее хранится внутри объектов, создаваемых фабрикой.
 */

@TaskDescription(taskNumber = 16, taskDescription = "Паттерн Приспособленец (Flyweight)", href = "org/knit/solutions/taskExampleClasses/README.md")
public class Task16_Sol implements Solution {
    @Override
    public void execute() {
        System.out.println("Задача 16 запущена");
        GlyphFactory factory = new GlyphFactory();
        String text = "ABBA";
        int x = 0;
        for (char c : text.toCharArray()) {
            Glyph glyph = factory.getGlyph(c);
            glyph.render(x++, 0, "bold");
        }
    }
}
