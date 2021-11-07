package ru.sbrf.reboot.application.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.sbrf.reboot.Request;
import ru.sbrf.reboot.Response;
import ru.sbrf.reboot.businnes.Issuer;


@RestController
public class ClientController {

    //@GetMapping("/start?cardNumber={cardNumber}&passCode={passCode}&issuer={issuer}")
    @GetMapping("/start")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public String getBalance(@Value("${application.server.url}") String url){
//    public String getBalance(@Value("${application.server.url}") String url, @PathVariable String cardNumber, @PathVariable String passCode, @PathVariable Issuer issuer) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Request> body = new HttpEntity<>(new Request("cardNumber"), headers);

        final Response response = restTemplate.postForObject(url, body, Response.class);
        return "balance: "+response.getBalance().toString();

    }
}
