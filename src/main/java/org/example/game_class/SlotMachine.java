package org.example.game_class;

import org.example.types.GameDailyRevenue;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

public class SlotMachine extends Game {
    private int numOfRollsAfterWin;

    public SlotMachine(BigDecimal gameBank, UUID gameId, int amountOfMaxPlayers, GameDailyRevenue gameDailyRevenue) {
        super(gameBank, gameId, amountOfMaxPlayers, gameDailyRevenue);
    }

    public int getNumOfRollsAfterWin() {
        return numOfRollsAfterWin;
    }

    public void play() {
        int rolls = 0;
        while (!isWin()) {
            rolls++;
        }
        numOfRollsAfterWin = rolls;
    }

    private boolean isWin() {
        Random random = new Random();
        int chance = random.nextInt(2);
        return chance == 0;
    }
}
