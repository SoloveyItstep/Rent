package com.vs.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String description;
    private float coast;
    private String rent_duration;
    private String image;

    @ManyToOne(optional = true)
    @JoinColumn(name = "subcategory_id")
    @JsonManagedReference
    private Categories subcategory;

    @OneToMany(mappedBy = "product")
    @JsonManagedReference
    private List<ProductInfo> productInfos;

    @OneToOne(mappedBy = "product")
    @JsonManagedReference
    private ProductCount productCount;

    @OneToMany(mappedBy = "product")
    private List<RentProducts> rentProducts;

    public Products() {
    }

    public Products(String name, String description,
                    float coast, String rent_duration,
                    String image, Categories subcategory,
                    List<ProductInfo> productInfos, ProductCount productCount,
                    List<RentProducts> rentProducts) {
        this.name = name;
        this.description = description;
        this.coast = coast;
        this.rent_duration = rent_duration;
        this.image = image;
        this.subcategory = subcategory;
        this.productInfos = productInfos;
        this.productCount = productCount;
        this.rentProducts = rentProducts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCoast() {
        return coast;
    }

    public void setCoast(float coast) {
        this.coast = coast;
    }

    public String getRent_duration() {
        return rent_duration;
    }

    public void setRent_duration(String rent_duration) {
        this.rent_duration = rent_duration;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Categories getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Categories subcategory) {
        this.subcategory = subcategory;
    }

    public List<ProductInfo> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<ProductInfo> productInfos) {
        this.productInfos = productInfos;
    }

    public ProductCount getProductCount() {
        return productCount;
    }

    public void setProductCount(ProductCount productCount) {
        this.productCount = productCount;
    }

    public List<RentProducts> getRentProducts() {
        return rentProducts;
    }

    public void setRentProducts(List<RentProducts> rentProducts) {
        this.rentProducts = rentProducts;
    }
}
