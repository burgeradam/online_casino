package org.example.game_class;

import org.example.types.GameDailyRevenue;

import java.math.BigDecimal;
import java.util.UUID;

public class BlackJack extends GameRequireDealer {
    public BlackJack(BigDecimal gameBank, UUID gameId, int amountOfMaxPlayers, GameDailyRevenue gameDailyRevenue) {
        super(gameBank, gameId, amountOfMaxPlayers, gameDailyRevenue);
    }
}
