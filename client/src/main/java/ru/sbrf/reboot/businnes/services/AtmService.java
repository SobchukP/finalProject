package ru.sbrf.reboot.businnes.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.sbrf.reboot.RequestAuthorizedStatus;
import ru.sbrf.reboot.RequestBalance;
import ru.sbrf.reboot.ResponseAuthorizedStatus;
import ru.sbrf.reboot.ResponseBalance;
import ru.sbrf.reboot.businnes.card.Card;

import java.math.BigDecimal;

@Service
public class AtmService {

    @Value("${application.server.url}") String url;
    @Value("{application.server.url_auth}") String urlAuth;

    public BigDecimal getBalance(Card card) throws IllegalAccessException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<RequestBalance> body = new HttpEntity<>(new RequestBalance(card.getCardNumber()), headers);

        final ResponseBalance response = restTemplate.postForObject(url, body, ResponseBalance.class);
        return response.getBalance();
    }

    public boolean checkAuth(Card card, String pin){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<RequestAuthorizedStatus> body = new HttpEntity<>(new RequestAuthorizedStatus(card.getCardNumber(), pin), headers);

        final ResponseAuthorizedStatus response = restTemplate.postForObject(url, body, ResponseAuthorizedStatus.class);
        return response.isAuthorized();
    }

}
