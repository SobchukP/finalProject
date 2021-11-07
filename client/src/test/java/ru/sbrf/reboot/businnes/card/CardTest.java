package ru.sbrf.reboot.businnes.card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.sbrf.reboot.businnes.Issuer;

public class CardTest {

    @Test
    public void getPassCode(){
        Card card = new Card("1111 2222 3333 4444", "0000", Issuer.BANK_ONE);

        Assertions.assertEquals("0000", card.getPin());
    }
}
