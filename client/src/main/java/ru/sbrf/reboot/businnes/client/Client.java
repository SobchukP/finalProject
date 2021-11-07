package ru.sbrf.reboot.businnes.client;

import lombok.Data;
import ru.sbrf.reboot.businnes.atm.Atm;
import ru.sbrf.reboot.businnes.atm.AtmService;
import ru.sbrf.reboot.businnes.card.Card;

@Data
public class Client {

    private Card card;
    private String passCodeInMemory;

    public Client(Card card, String passCodeInMemory) {
        this.card = card;
        this.passCodeInMemory = passCodeInMemory;
    }

    public AtmService insertCard(Atm atm, Card card) throws IllegalAccessException {
        return atm.acceptCard(passCodeInMemory, card);
    }

}
