package com.vs.repository;


import com.vs.entity.ProductInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface ProductInfoRepository extends CrudRepository<ProductInfo, Long> {
    @Override
    ProductInfo save(ProductInfo productInfo);

    @Override
    ProductInfo findOne(Long id);

    @Override
    Collection<ProductInfo> findAll();

    Collection<ProductInfo> findInfosByProductId(Long productId);

    @Override
    void delete(Long id);

    @Override
    boolean exists(Long id);

    @Override
    long count();
}
