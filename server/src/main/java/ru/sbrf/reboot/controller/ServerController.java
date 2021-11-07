package ru.sbrf.reboot.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sbrf.reboot.RequestAuthorizedStatus;
import ru.sbrf.reboot.RequestBalance;
import ru.sbrf.reboot.ResponseAuthorizedStatus;
import ru.sbrf.reboot.ResponseBalance;
import ru.sbrf.reboot.service.AccountService;

@Data
@RestController
@AllArgsConstructor
public class ServerController {

    private AccountService service;

    @PostMapping("/balance")
    public ResponseBalance getBalance(RequestBalance request){
        return new ResponseBalance(service.getAccount(request.getCardNumber()).getBalance());
    }

    @PostMapping("/authorized")
    public ResponseAuthorizedStatus checkPin(RequestAuthorizedStatus request) {

        return new ResponseAuthorizedStatus(service.getAccount(request.getPin()).equals(request.getPin()));
    }
}
