package com.vs.Services.Interfaces;


import com.vs.entity.ProductInfo;

import java.util.Collection;

public interface ProductInfoService {
    void addProductInfo(ProductInfo productInfo);
    void updateProductInfo(ProductInfo productInfo);
    void removeProductInfo(Long id);
    Collection<ProductInfo> findProductInfo(Long id);
    ProductInfo findProductInfoById(Long id);
}
