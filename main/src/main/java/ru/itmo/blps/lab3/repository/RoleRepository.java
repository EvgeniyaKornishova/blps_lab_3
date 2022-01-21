package ru.itmo.blps.lab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itmo.blps.lab3.data.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
