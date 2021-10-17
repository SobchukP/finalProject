package ru.sbrf.reboot.businnes.atm;

import lombok.Data;
import ru.sbrf.reboot.businnes.card.Card;

import java.math.BigDecimal;

@Data
public class AtmService {

    private Card card;

    protected AtmService(Card card){
        this.card = card;
    }

    public BigDecimal getBalance() {
        //какая-то логика вокруг вызова serverRequest() и обработки результатов
        return BigDecimal.ZERO;
    }

    private void serverRequest(){
        /**
         * Здесь будет реализация отправки запроса
         * набор входных и выходных параметров будет задан в дальнейшем
         */
        System.out.println(this.card);
    }
}
