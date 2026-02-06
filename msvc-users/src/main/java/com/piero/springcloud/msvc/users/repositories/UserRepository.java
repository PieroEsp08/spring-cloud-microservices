package com.piero.springcloud.msvc.users.repositories;

import com.piero.springcloud.msvc.users.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository  extends CrudRepository<User,Long> {

    Optional<User> findByUsername(String username);

}
