package org.example.types;

import java.math.BigDecimal;

public enum GameDailyRevenue {
    BLACK_JACK(new BigDecimal(1000000), CurrencyType.HUF),
    ROULETTE(new BigDecimal(2000000), CurrencyType.HUF),
    SLOT_MACHINE(new BigDecimal(500000), CurrencyType.HUF);

    private final BigDecimal amount;
    private final CurrencyType currencyType;

    GameDailyRevenue(BigDecimal amount, CurrencyType currencyType) {
        this.amount = amount;
        this.currencyType = currencyType;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
