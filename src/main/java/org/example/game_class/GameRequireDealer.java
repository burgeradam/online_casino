package org.example.game_class;

import org.example.Dealer;
import org.example.types.GameDailyRevenue;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class GameRequireDealer extends Game {
    protected Dealer dealer = null;

    public GameRequireDealer(BigDecimal gameBank, UUID gameId, int amountOfMaxPlayers, GameDailyRevenue gameDailyRevenue) {
        super(gameBank, gameId, amountOfMaxPlayers, gameDailyRevenue);
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Dealer getDealer() {
        return dealer;
    }
}
