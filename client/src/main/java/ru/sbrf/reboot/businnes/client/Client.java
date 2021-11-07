package ru.sbrf.reboot.businnes.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ru.sbrf.reboot.businnes.card.Card;

@Data
@AllArgsConstructor
@Builder
public class Client {

    private Card card;
    private String name;
    private String pin;

}
