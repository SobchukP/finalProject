package ru.sbrf.reboot;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class Response {

    private BigDecimal balance;

    public Response(BigDecimal balance){
        this.balance = balance;
    }
}
