package com.vs.Services.Interfaces;


import com.vs.entity.Users;

import java.util.Collection;

public interface UsersService {
    void registerNewUser(Users user);

    Users findUserById(Long id);

    void updateUser(Users user);

    Collection<Users> findAllUsers();

    void deleteUser(Long id);
}
