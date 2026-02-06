package com.piero.springcloud.msvc.users.services;

import com.piero.springcloud.msvc.users.entities.User;

import java.util.Optional;

public interface IUserService {

    Optional<User> findById(Long id);

    Optional<User> findByUsername(String username);

    Iterable<User> findAll();

    User save(User user);

    Optional<User> update(User user, Long id);

    void delete(Long id);

}
