package com.vs.Services.Implements;

import com.vs.Services.Interfaces.StatusService;
import com.vs.entity.Statuses;
import com.vs.repository.StatusesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StatusesServiceImpl implements StatusService {

    @Autowired
    StatusesRepository repository;

    @Override
    public void addStatus(Statuses status) {
        repository.save(status);
    }

    @Override
    public Statuses findStatusById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Collection<Statuses> findAllStatuses() {
        return repository.findAll();
    }

    @Override
    public void deleteStatus(Long id) {
        repository.delete(id);
    }
}
