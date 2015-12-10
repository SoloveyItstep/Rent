package com.vs.Services.Interfaces;

import com.vs.entity.Statuses;

import java.util.Collection;

public interface StatusService {
    void addStatus(Statuses status);

    Statuses findStatusById(Long id);

    Collection<Statuses> findAllStatuses();

    void deleteStatus(Long id);
}
