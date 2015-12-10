package com.vs.Services.Implements;

import com.vs.Services.Interfaces.StatusService;
import com.vs.Services.Interfaces.UsersService;
import com.vs.entity.Statuses;
import com.vs.entity.Users;
import com.vs.repository.StatusesRepository;
import com.vs.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class UsersServiceImpl implements UsersService, StatusService{
    @Autowired
    UsersRepository usersRepository;

    @Autowired
    StatusesRepository statusesRepository;

    @Override
    public void registerNewUser(Users user) {

    }

    @Override
    public Users findUserById(Long id) {
        return null;
    }

    @Override
    public void updateUser(Users user) {

    }

    @Override
    public Collection<Users> findAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public void addStatus(Statuses status) {

    }

    @Override
    public Statuses findStatusById(Long id) {
        return null;
    }

    @Override
    public Collection<Statuses> findAllStatuses() {
        return null;
    }

    @Override
    public void deleteStatus(Long id) {

    }
}
