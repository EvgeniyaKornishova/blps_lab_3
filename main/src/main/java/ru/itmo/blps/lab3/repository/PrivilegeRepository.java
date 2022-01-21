package ru.itmo.blps.lab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itmo.blps.lab3.data.Privilege;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {
    Privilege findByName(String name);
}
