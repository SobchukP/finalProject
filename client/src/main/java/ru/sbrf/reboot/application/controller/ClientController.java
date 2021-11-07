package ru.sbrf.reboot.application.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.sbrf.reboot.businnes.Issuer;
import ru.sbrf.reboot.businnes.card.Card;
import ru.sbrf.reboot.businnes.client.Client;
import ru.sbrf.reboot.businnes.services.AtmService;

import java.math.BigDecimal;


@RestController
@AllArgsConstructor
public class ClientController {

    private AtmService service;

    @GetMapping("/start?clientName={clientName}&pin={pin}&cardNumber={cardNumber}&&issuer={issuer}")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public BigDecimal getBalance(
                                 @PathVariable String name,
                                 @PathVariable String cardNumber,
                                 @PathVariable String pin,
                                 @PathVariable Issuer issuer) throws IllegalAccessException {

        Card card = new Card(cardNumber, pin, issuer);
        Client client = new Client(card, name, pin);
        System.out.println(client);
        service.checkAuth(card, client.getPin());
        return service.getBalance(card);

    }
}
