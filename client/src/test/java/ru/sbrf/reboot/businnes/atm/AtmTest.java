package ru.sbrf.reboot.businnes.atm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.sbrf.reboot.businnes.Issuer;
import ru.sbrf.reboot.businnes.card.Card;
import ru.sbrf.reboot.businnes.client.Client;


public class AtmTest {

    @Test
    public void acceptCard(){
        Card card = new Card("1111 2222 3333 4444", "1001", Issuer.SBRF);
        Client client = new Client(card, "1001");
        Atm atm = new Atm(Issuer.SBRF);

        Assertions.assertThrows(IllegalAccessException.class, () -> {
            atm.acceptCard("1002",card);
        });
    }
}
