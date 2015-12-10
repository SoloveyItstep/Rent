package com.vs.repository;


import com.vs.entity.RentProducts;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface RentStatusRepository extends CrudRepository<RentProducts,Long> {
    @Override
    RentProducts save(RentProducts rentProducts);

    @Override
    RentProducts findOne(Long id);

    @Override
    boolean exists(Long id);

    @Override
    Collection<RentProducts> findAll();

    Collection<RentProducts> findRentProductsByProductId(Long productId);

    @Override
    long count();

    @Override
    void delete(Long id);
}
