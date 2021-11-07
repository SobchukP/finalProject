package ru.sbrf.reboot.businnes.card;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ru.sbrf.reboot.businnes.Issuer;

@Data
@AllArgsConstructor
@Builder
public class Card {

    private String cardNumber;
    private String pin;
    private Issuer issuer;

}
