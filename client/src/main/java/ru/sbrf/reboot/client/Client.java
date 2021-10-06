package ru.sbrf.reboot.client;

import lombok.Data;
import ru.sbrf.reboot.card.Card;

@Data
public class Client {

    private Card card;

    public Client(Card card) {

    }

    public String getPassCodeCard() {
        return this.card.getPassCode();
    }
}
