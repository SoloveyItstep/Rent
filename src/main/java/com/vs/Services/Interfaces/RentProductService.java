package com.vs.Services.Interfaces;


import com.vs.entity.RentProducts;

import java.util.Collection;

public interface RentProductService {
    void addRentProduct(RentProducts rentProduct);

    void updateRentProduct(RentProducts rentProduct);

    RentProducts findRentProductById(Long id);

    Collection<RentProducts> findRentProducts();

    Collection<RentProducts> findRentProductsByProductId(Long productId);

    void deleteRentProduct(Long id);
}
