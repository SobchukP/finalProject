package ru.sbrf.reboot.businnes.client;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.sbrf.reboot.businnes.Issuer;
import ru.sbrf.reboot.businnes.card.Card;

public class ClientTest {

    @Test
    public void getCard(){

        Card card = new Card("1111 2222 3333 4444", "0000", Issuer.SBRF);
        Client client = new Client(card, "0000");

        Assertions.assertTrue(client.getCard().equals(card));
    }

    @Test
    public void getPassCodeInMemory(){

        Card card = new Card("1111 2222 3333 4444", "0000", Issuer.SBRF);
        Client client = new Client(card, "0000");

        Assertions.assertEquals("0000", client.getPassCodeInMemory());
    }


}
