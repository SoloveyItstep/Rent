package com.vs.Services.Implements;

import com.vs.Services.Interfaces.ProductInfoService;
import com.vs.Services.Interfaces.ProductsCountService;
import com.vs.Services.Interfaces.ProductsService;
import com.vs.Services.Interfaces.RentProductService;
import com.vs.entity.ProductCount;
import com.vs.entity.ProductInfo;
import com.vs.entity.Products;
import com.vs.entity.RentProducts;
import com.vs.repository.ProductCountRepository;
import com.vs.repository.ProductInfoRepository;
import com.vs.repository.ProductsRepository;
import com.vs.repository.RentStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductServiceImpl implements ProductsService, ProductInfoService, ProductsCountService, RentProductService{

    @Autowired
    ProductsRepository productsRepository;

    @Autowired
    ProductInfoRepository productInfoRepository;

    @Autowired
    ProductCountRepository productCountRepository;

    @Autowired
    RentStatusRepository rentStatusRepository;

    @Override
    public void addProduct(Products products) {
        productsRepository.save(products);
    }

    @Override
    public void updateProduct(Products products) {
        productsRepository.save(products);
    }

    @Override
    public void removeProduct(Long id) {
        productsRepository.delete(id);
    }

    @Override
    public Collection<Products> findProducts() {
        return productsRepository.findAll();
    }

    @Override
    public Collection<Products> findProductsBySubcategoryId(Long subcategoryId) {
        Collection<Products> lst = productsRepository.findProductsBySubcategoryId(subcategoryId);
        return productsRepository.findProductsBySubcategoryId(subcategoryId);
    }

    @Override
    public Products findProductById(Long id) {
        return productsRepository.findOne(id);
    }

    //add check for current product id
    @Override
    public void addProductInfo(ProductInfo productInfo) {
        productInfoRepository.save(productInfo);
    }

    @Override
    public void updateProductInfo(ProductInfo productInfo) {
        productInfoRepository.save(productInfo);
    }

    @Override
    public void removeProductInfo(Long id) {
        productInfoRepository.delete(id);
    }

    @Override
    public Collection<ProductInfo> findProductInfoByProductId(Long id) {
        return productInfoRepository.findInfosByProductId(id);
    }

    @Override
    public ProductInfo findProductInfoById(Long id) {
        return productInfoRepository.findOne(id);
    }

    @Override
    public void addProductsCount(ProductCount productCount) {
        productCountRepository.save(productCount);
    }

    @Override
    public void updateProductCount(ProductCount productCount) {
        productCountRepository.save(productCount);
    }

    @Override
    public ProductCount findProductCountById(Long id) {
        return productCountRepository.findOne(id);
    }

    @Override
    public Collection<ProductCount> findAll() {
        return productCountRepository.findAll();
    }

    @Override
    public Collection<ProductCount> findProductsCountByProductId(Long productId) {
        return productCountRepository.findProductCountByProductId(productId);
    }

    @Override
    public void deleteProductCount(Long id) {
        productCountRepository.delete(id);
    }

    @Override
    public void addRentProduct(RentProducts rentProduct) {
        rentStatusRepository.save(rentProduct);
    }

    @Override
    public void updateRentProduct(RentProducts rentProduct) {
        rentStatusRepository.save(rentProduct);
    }

    @Override
    public RentProducts findRentProductById(Long id) {
        return rentStatusRepository.findOne(id);
    }

    @Override
    public Collection<RentProducts> findRentProducts() {
        return rentStatusRepository.findAll();
    }

    @Override
    public Collection<RentProducts> findRentProductsByProductId(Long productId) {
        return rentStatusRepository.findRentProductsByProductId(productId);
    }

    @Override
    public void deleteRentProduct(Long id) {
        rentStatusRepository.delete(id);
    }
}
