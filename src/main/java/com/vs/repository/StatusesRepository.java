package com.vs.repository;


import com.vs.entity.Statuses;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface StatusesRepository extends CrudRepository<Statuses,Long> {
    @Override
    Statuses save(Statuses statuses);

    @Override
    Statuses findOne(Long id);

    @Override
    boolean exists(Long id);

    @Override
    Collection<Statuses> findAll();

    @Override
    long count();

    @Override
    void delete(Long id);
}
