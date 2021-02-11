package com.ensak.petines.repositories;


import com.ensak.petines.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {
     List<User> findAll();

     Optional<User> findById(Integer id);

     User findByUsername(String username);
}