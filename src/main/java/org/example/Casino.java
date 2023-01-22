package org.example;

import org.example.game_class.Game;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Casino {
    private BigDecimal currentAmountOfMoney;
    private ArrayList<Game> gameArrayList;

    public Casino(BigDecimal currentAmountOfMoney, ArrayList<Game> gameArrayList) {
        this.currentAmountOfMoney = currentAmountOfMoney;
        this.gameArrayList = gameArrayList;
    }
    public BigDecimal calculateDailyRevenue() {
        BigDecimal result = new BigDecimal(0);
        BigDecimal counter;
        for (Game game : gameArrayList) {
            counter = game.getGameDailyRevenue().getAmount();
            result = result.add(counter);
        }
        return result;
    }
    public BigDecimal calculateTotalBalance() {
        BigDecimal gamesMoney = new BigDecimal(0);
        BigDecimal counter;
        for (Game game : gameArrayList) {
            counter = game.getGameBank();
            gamesMoney = gamesMoney.add(counter);
        }
        return currentAmountOfMoney.add(gamesMoney);
    }
}
