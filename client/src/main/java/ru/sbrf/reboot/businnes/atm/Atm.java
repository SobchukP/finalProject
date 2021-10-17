package ru.sbrf.reboot.businnes.atm;

import lombok.Data;
import ru.sbrf.reboot.businnes.card.Card;
import ru.sbrf.reboot.businnes.Issuer;

@Data
public class Atm {
    private Issuer issuer;

    public Atm(Issuer issuer) {
        this.issuer = issuer;
    }

    public AtmService acceptCard(String passCodeCard, Card card) throws IllegalAccessException {
        int counter = 0;
        while (!passCodeCard.equals(card.getPassCode())){
            counter++;
            if (counter > 2) throw new IllegalAccessException("Pass Code incorrect");
        }
        return new AtmService(card);
    }
}
