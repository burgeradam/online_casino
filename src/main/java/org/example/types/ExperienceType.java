package org.example.types;

import java.math.BigDecimal;

public enum ExperienceType {
    NEWBIE(new BigDecimal(50000), CurrencyType.HUF),
    MID_LEVEL(new BigDecimal(80000), CurrencyType.HUF),
    PRO(new BigDecimal(120000), CurrencyType.HUF);

    private final CurrencyType currencyType;
    private final BigDecimal amount;

    ExperienceType(BigDecimal amount, CurrencyType currencyType) {
        this.amount = amount;
        this.currencyType = currencyType;
    }
}
