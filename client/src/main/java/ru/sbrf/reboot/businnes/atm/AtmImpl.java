package ru.sbrf.reboot.businnes.atm;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.sbrf.reboot.businnes.card.Card;
import ru.sbrf.reboot.businnes.Issuer;
import ru.sbrf.reboot.businnes.services.AtmService;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class AtmImpl implements Atm{
    private Issuer issuer;

    @Override
    public boolean isAuthorized(String pin, Card card){
        return new AtmService().checkAuth(card, pin);
    }

    @Override
    public BigDecimal getBalance(Card card) throws IllegalAccessException {
        return new AtmService().getBalance(card);
    }
}
