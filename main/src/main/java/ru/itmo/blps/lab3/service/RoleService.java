package ru.itmo.blps.lab3.service;

import org.springframework.stereotype.Service;
import ru.itmo.blps.lab3.data.Role;
import ru.itmo.blps.lab3.repository.RoleRepository;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }
}
