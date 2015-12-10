package com.vs.Services.Interfaces;


import com.vs.entity.ProductCount;

import java.util.Collection;

public interface ProductsCountService {
    void addProductsCount(ProductCount productCount);

    void updateProductCount(ProductCount productCount);

    ProductCount findProductCountById(Long id);

    Collection<ProductCount> findAll();

    Collection<ProductCount> findProductsCountByProductId(Long productId);

    void deleteProductCount(Long id);
}
