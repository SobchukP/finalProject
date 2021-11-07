package ru.sbrf.reboot.businnes.atm;

import ru.sbrf.reboot.businnes.card.Card;

import java.math.BigDecimal;

public interface Atm {

    BigDecimal getBalance(Card card) throws IllegalAccessException;

    boolean isAuthorized(String pin, Card card);

}
