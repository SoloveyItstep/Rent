package com.vs.repository;

import com.vs.entity.ProductCount;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface ProductCountRepository extends CrudRepository<ProductCount,Long> {
    @Override
    ProductCount save(ProductCount productCount);

    @Override
    ProductCount findOne(Long id);

    @Override
    boolean exists(Long id);

    @Override
    Collection<ProductCount> findAll();

    Collection<ProductCount> findProductCountByProductId(Long productId);

    @Override
    long count();

    @Override
    void delete(Long id);
}
