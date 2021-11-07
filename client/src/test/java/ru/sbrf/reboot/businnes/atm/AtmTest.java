package ru.sbrf.reboot.businnes.atm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.sbrf.reboot.businnes.Issuer;
import ru.sbrf.reboot.businnes.card.Card;
import ru.sbrf.reboot.businnes.client.Client;


public class AtmTest {

    @Test
    public void acceptCard(){
        Card card = new Card("1111 2222 3333 4444", "1001", Issuer.BANK_ONE);
        Client client = new Client(card, "Name", "1001");
        AtmImpl atm = new AtmImpl(Issuer.BANK_ONE);

        Assertions.assertThrows(IllegalAccessException.class, () -> {
            atm.isAuthorized("1002",card);
        });
    }
}
