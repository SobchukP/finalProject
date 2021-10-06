package ru.sbrf.reboot.atm;

import lombok.Data;
import ru.sbrf.reboot.card.Card;
import ru.sbrf.reboot.Issuer;

import java.math.BigDecimal;

@Data
public class Atm {
    private Issuer issuer;
    private Card innerCard;

    public Atm(Issuer issuer) {
        this.issuer = issuer;
    }

    public void insertCard(Card card){
        this.innerCard = card;
    }

    public void returnCard(){
        this.innerCard = null;
    }

    public boolean acceptCard(String passCodeCard) {
        return passCodeCard.equals(innerCard.getPassCode());
    }

    public BigDecimal getBalance() {
        return BigDecimal.ZERO;
    }
}
