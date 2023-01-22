package org.example.game_class;

import org.example.types.ExperienceType;
import org.example.types.GameDailyRevenue;

import java.math.BigDecimal;
import java.util.UUID;

public class Roulette extends GameRequireDealer {

    public Roulette(BigDecimal gameBank, UUID gameId, int amountOfMaxPlayers, GameDailyRevenue gameDailyRevenue) {
        super(gameBank, gameId, amountOfMaxPlayers, gameDailyRevenue);
    }
    public boolean isDealerAllowed() {
        return dealer == null || !dealer.getExperienceType().equals(ExperienceType.PRO);
    }
    public String play() {
        return isDealerAllowed() ? "set dealer or type mismatch" : "ok";
    }
}
