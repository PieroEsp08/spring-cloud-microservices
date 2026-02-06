package com.piero.springcloud.msvc.users.repositories;


import com.piero.springcloud.msvc.users.entities.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
