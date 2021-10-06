package ru.sbrf.reboot.card;

import lombok.Data;
import ru.sbrf.reboot.Issuer;

@Data
public class Card {

    private String cardNumber;
    private String passCode;
    private Issuer issuer;

    public Card(String cardNumber, String passCode, Issuer issuer) {
        this.cardNumber = cardNumber;
        this.passCode = passCode;
        this.issuer = issuer;
    }
}
