package ru.sbrf.reboot;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Request {

    private String cardNumber;

    public Request (String cardNumber){
        this.cardNumber = cardNumber;
    }

}
