package ru.sbrf.reboot.card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.sbrf.reboot.Issuer;
import ru.sbrf.reboot.card.Card;

public class CardTest {

    @Test
    public void getPassCode(){
        Card card = new Card("1111 2222 3333 4444", "0000", Issuer.SBRF);

        Assertions.assertEquals("0000", card.getPassCode());
    }
}
