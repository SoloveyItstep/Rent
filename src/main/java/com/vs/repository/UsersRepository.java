package com.vs.repository;


import com.vs.entity.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface UsersRepository extends CrudRepository<Users,Long> {
    @Override
    Users save(Users users);

    @Override
    Users findOne(Long id);

    @Override
    boolean exists(Long id);

    @Override
    Collection<Users> findAll();

    @Override
    long count();

    @Override
    void delete(Long id);

    Users findByUsername(String username);
}
