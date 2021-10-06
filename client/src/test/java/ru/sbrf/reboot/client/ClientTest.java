package ru.sbrf.reboot.client;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.sbrf.reboot.Issuer;
import ru.sbrf.reboot.card.Card;

public class ClientTest {

    @Test
    public void getCard(){

        Card card = new Card("1111 2222 3333 4444", "0000", Issuer.SBRF);
        Client client = new Client(card);

        Assertions.assertTrue(client.getCard().equals(card));
    }

    @Test
    public void getPassCodeCard(){

        Card card = new Card("1111 2222 3333 4444", "0000", Issuer.SBRF);
        Client client = new Client(card);

        Assertions.assertEquals("0000", client.getPassCodeCard());
    }
}
