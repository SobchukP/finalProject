package ru.sbrf.reboot.atm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import ru.sbrf.reboot.Issuer;
import ru.sbrf.reboot.atm.Atm;
import ru.sbrf.reboot.card.Card;
import ru.sbrf.reboot.client.Client;

import java.math.BigDecimal;
import java.util.Random;

import static org.mockito.Mockito.when;

public class AtmTest {

    @Mock
    Atm atm;

    @BeforeEach
    void setUp(){
        atm = Mockito.mock(Atm.class);
    }

    @Test
    public void acceptCard() {
        Card card = new Card("1111 2222 3333 4444", "0000", Issuer.SBRF);
        Client client = new Client(card);
        Atm atm = new Atm(Issuer.SBRF);

        Assertions.assertTrue(atm.acceptCard(client.getPassCodeCard()));
        Assertions.assertFalse(atm.acceptCard("1001"));
    }

    @Test
    public void insertCard(){
        Card card = new Card("1111 2222 3333 4444", "0000", Issuer.SBRF);
        Client client = new Client(card);

        Atm atm = new Atm(Issuer.SBRF);

        atm.insertCard(client.getCard());

        Assertions.assertNotNull(atm.getInnerCard());
    }

    @Test
    public void returnCard(){
        Card card = new Card("1111 2222 3333 4444", "0000", Issuer.SBRF);
        Atm atm = new Atm(Issuer.SBRF);

        atm.insertCard(card);
        atm.returnCard();

        Assertions.assertNull(atm.getInnerCard());
    }

    @Test
    public void getBalance(){
        when(atm.getBalance()).thenReturn(BigDecimal.valueOf(new Random().nextDouble()));
    }
}
