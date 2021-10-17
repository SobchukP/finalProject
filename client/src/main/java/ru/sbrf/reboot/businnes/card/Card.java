package ru.sbrf.reboot.businnes.card;

import lombok.Data;
import ru.sbrf.reboot.businnes.Issuer;

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
