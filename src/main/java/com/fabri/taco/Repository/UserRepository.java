package com.fabri.taco.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.fabri.taco.Domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUsername(String username);
    
}
