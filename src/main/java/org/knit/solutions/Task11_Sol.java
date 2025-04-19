package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.Task11.EmailNotifier;
import org.knit.solutions.Task11.MobileApp;
import org.knit.solutions.Task11.Stock;
import org.knit.solutions.Task11.StockObserver;

/*
Вы разрабатываете приложение для биржевой торговли, где пользователи могут подписываться на обновления акций определённых компаний.

Требуется:
Создать класс Stock (акция), который хранит информацию о текущей цене и может уведомлять подписчиков об изменении цены.
Создать интерфейс StockObserver и реализовать его в классах MobileApp и EmailNotifier, которые получают уведомления при изменении цены.
Реализовать механизм подписки и отписки для StockObserver.

Пример работы:
Пользователь подписывается на акции компании "Tesla".
Когда цена акции изменяется, приложение отправляет уведомления подписчикам.
Если пользователь отписался, он больше не получает уведомления.
Дополнительно: Добавьте возможность подписки на акции нескольких компаний.
 */

@TaskDescription(taskNumber = 11, taskDescription = "Паттерн Observer (Наблюдатель)", href = "org/knit/solutions/taskExampleClasses/README.md")
public class Task11_Sol implements Solution {
    @Override
    public void execute() {
        System.out.println("Задача 11 запущена");
        Stock tesla = new Stock("Tesla", 1000.0);
        Stock apple = new Stock("Apple", 200.0);

        StockObserver user1 = new MobileApp("Иван");
        StockObserver user2 = new EmailNotifier("ivan@example.com");

        tesla.addObserver(user1);
        tesla.addObserver(user2);
        apple.addObserver(user1);

        tesla.setPrice(1050.0);
        apple.setPrice(210.0);

        tesla.removeObserver(user1);
        tesla.setPrice(1100.0);
    }
}
