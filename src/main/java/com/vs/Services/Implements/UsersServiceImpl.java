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
        usersRepository.save(user);
    }

    @Override
    public Users findUserById(Long id) {
        return usersRepository.findOne(id);
    }

    @Override
    public void updateUser(Users user) {
        usersRepository.save(user);
    }

    @Override
    public Collection<Users> findAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        usersRepository.delete(id);
    }

    @Override
    public void addStatus(Statuses status) {
        statusesRepository.save(status);
    }

    @Override
    public Statuses findStatusById(Long id) {
        return statusesRepository.findOne(id);
    }

    @Override
    public Collection<Statuses> findAllStatuses() {
        return statusesRepository.findAll();
    }

    @Override
    public void deleteStatus(Long id) {
        statusesRepository.delete(id);
    }
}
