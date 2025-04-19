package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.Task17.MontyHallSimulation;

/*
📌 Описание:
Парадокс Монти Холла — это задача из теории вероятностей, основанная на популярном шоу "Let's Make a Deal".
Правила такие:

Участник выбирает одну из трёх дверей.
Ведущий, который знает, что за дверями, открывает одну из оставшихся дверей, за которой нет приза.
Участнику предлагается либо сменить выбор на оставшуюся дверь, либо оставить свой выбор неизменным.
📌 Вопрос:

Реализуйте симуляцию этой игры на Java, чтобы проверить, что лучше: менять выбор или оставаться при своём?.
Программа должна провести большое количество экспериментов (например, 1000000) и показать вероятность выигрыша в каждом из двух случаев.
📌 Ожидаемый результат:
При достаточно большом количестве игр (например, 1 миллион):

Вероятность выигрыша при переключении: около 66.66% (или 2/3).
Вероятность выигрыша без переключения: около 33.33% (или 1/3).
 */

@TaskDescription(taskNumber = 17, taskDescription = "Реализация и проверка парадокса Монти Холла", href = "org/knit/solutions/taskExampleClasses/README.md")
public class Task17_Sol implements Solution {
    @Override
    public void execute() {
        System.out.println("Задача 17 запущена");
        int totalGames = 1_000_000;
        MontyHallSimulation simulation = new MontyHallSimulation(totalGames);
        simulation.runSimulation();

        double stayWinPercentage = simulation.getStayWinPercentage();
        double switchWinPercentage = simulation.getSwitchWinPercentage();

        System.out.println("Общее количество игр: " + totalGames);
        System.out.println("Вероятность выигрыша при неизменном выборе: " + stayWinPercentage + "%");
        System.out.println("Вероятность выигрыша при смене выбора: " + switchWinPercentage + "%");
    }
}
