package org.example;

import org.example.game_class.BlackJack;
import org.example.game_class.Game;
import org.example.game_class.Roulette;
import org.example.game_class.SlotMachine;
import org.example.types.ExperienceType;
import org.example.types.GameDailyRevenue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Dealer dealer1 = new Dealer("Sanyi", ExperienceType.MID_LEVEL);
        Dealer dealer2 = new Dealer("Feri", ExperienceType.PRO);

        SlotMachine slotMachine = new SlotMachine(new BigDecimal(1), UUID.randomUUID(), 1, GameDailyRevenue.SLOT_MACHINE);
        BlackJack blackJack1 = new BlackJack(new BigDecimal(0), UUID.randomUUID(), 6, GameDailyRevenue.BLACK_JACK);
        Roulette roulette = new Roulette(new BigDecimal(0), UUID.randomUUID(), 6, GameDailyRevenue.BLACK_JACK);

        roulette.setDealer(dealer2);
        ArrayList<Game> games = new ArrayList<>(Arrays.asList(slotMachine, blackJack1, roulette));
        Casino casino = new Casino(new BigDecimal(1), games);
        System.out.println("Daily revenue: " + casino.calculateDailyRevenue());
        System.out.println("Total balance: " + casino.calculateTotalBalance());
    }
}