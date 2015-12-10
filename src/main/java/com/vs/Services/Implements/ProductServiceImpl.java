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
        return null;
    }

    @Override
    public void addProductInfo(ProductInfo productInfo) {

    }

    @Override
    public void updateProductInfo(ProductInfo productInfo) {

    }

    @Override
    public void removeProductInfo(Long id) {

    }

    @Override
    public Collection<ProductInfo> findProductInfo(Long id) {
        return null;
    }

    @Override
    public ProductInfo findProductInfoById(Long id) {
        return null;
    }

    @Override
    public void addProductsCount(ProductCount productCount) {

    }

    @Override
    public void updateProductCount(ProductCount productCount) {

    }

    @Override
    public ProductCount findProductCountById(Long id) {
        return null;
    }

    @Override
    public Collection<ProductCount> findAll() {
        return null;
    }

    @Override
    public Collection<ProductCount> findProductCountByProductId(Long productId) {
        return null;
    }

    @Override
    public void deleteProductCount(Long id) {

    }

    @Override
    public void addRentProduct(RentProducts rentProduct) {

    }

    @Override
    public void updateRentProduct(RentProducts rentProduct) {

    }

    @Override
    public RentProducts findRentProductById(Long id) {
        return null;
    }

    @Override
    public Collection<RentProducts> findRentProducts() {
        return null;
    }

    @Override
    public Collection<RentProducts> findRentProductsByProductId(Long productId) {
        return null;
    }

    @Override
    public void deleteRentProduct(Long id) {

    }
}
