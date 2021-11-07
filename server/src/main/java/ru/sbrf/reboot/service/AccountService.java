package ru.sbrf.reboot.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sbrf.reboot.entity.Account;
import ru.sbrf.reboot.repository.ClientRepository;

@AllArgsConstructor
@Service
public class AccountService {

    private ClientRepository repository;

    public Account getAccount(String card) {
        return repository.findByCard(card);
    }
}
