package ru.sbrf.reboot;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor

public class ResponseBalance {

    private BigDecimal balance;

    public ResponseBalance(BigDecimal balance){
        this.balance = balance;
    }
}
