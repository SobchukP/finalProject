package ru.sbrf.reboot.repository;

import org.springframework.data.repository.CrudRepository;
import ru.sbrf.reboot.entity.Account;

public interface ClientRepository extends CrudRepository<Account, Long> {

    Account findByCard(String card);
}
