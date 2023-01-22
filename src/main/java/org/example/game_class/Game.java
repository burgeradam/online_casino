package org.example.game_class;

import org.example.types.GameDailyRevenue;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Game {
    protected BigDecimal gameBank;
    protected UUID gameId;
    protected int amountOfMaxPlayers;
    protected int amountOfPlayers = 0;
    private final GameDailyRevenue gameDailyRevenue;

    public Game(BigDecimal gameBank, UUID gameId, int amountOfMaxPlayers, GameDailyRevenue gameDailyRevenue) {
        this.gameBank = gameBank;
        this.gameId = gameId;
        this.amountOfMaxPlayers = amountOfMaxPlayers;
        this.gameDailyRevenue = gameDailyRevenue;
    }

    public void addPlayer() {
        if (!isTooMuchPlayer()) {
            amountOfPlayers++;
        }
    }

    public BigDecimal getGameBank() {
        return gameBank;
    }

    public GameDailyRevenue getGameDailyRevenue() {
        return gameDailyRevenue;
    }

    public boolean isTooMuchPlayer() {
        return amountOfMaxPlayers <= amountOfPlayers;
    }
}
