package org.knit.solutions.Task17;

import java.util.Random;

public class MontyHallSimulation {

    private int totalGames;
    private int stayWins;
    private int switchWins;
    private Random random;

    public MontyHallSimulation(int totalGames) {
        this.totalGames = totalGames;
        this.stayWins = 0;
        this.switchWins = 0;
        this.random = new Random();
    }

    public void runSimulation() {
        for (int i = 0; i < totalGames; i++) {
            int prizeDoor = random.nextInt(3);
            int playerChoice = random.nextInt(3);

            int revealedDoor;
            do {
                revealedDoor = random.nextInt(3);
            } while (revealedDoor == prizeDoor || revealedDoor == playerChoice);

            int switchedChoice = 3 - playerChoice - revealedDoor;

            if (playerChoice == prizeDoor) {
                stayWins++;
            }
            if (switchedChoice == prizeDoor) {
                switchWins++;
            }
        }
    }

    public double getStayWinPercentage() {
        return ((double) stayWins / totalGames) * 100;
    }

    public double getSwitchWinPercentage() {
        return ((double) switchWins / totalGames) * 100;
    }
}

