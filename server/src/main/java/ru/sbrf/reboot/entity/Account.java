package ru.sbrf.reboot.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Data
@Table("Accounts")
public class Account {

    @Id
    private Long id;
    private BigDecimal balance;
    private String card;
    private String pin;

}
