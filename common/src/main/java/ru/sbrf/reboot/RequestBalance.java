package ru.sbrf.reboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestBalance {

    private String cardNumber;

    public RequestBalance(String cardNumber){
        this.cardNumber = cardNumber;
    }

}
