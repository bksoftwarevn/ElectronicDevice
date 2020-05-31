package com.bksoftware.model;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private String model;
    private String code; // ma san pham
    private double price; // gia goc
    private double promotion_price; // gia khuyen mai
    private boolean sold_out; // true: het hang
    private int guarantee; // thoi gian bao hanh (thang)
    private String image; // image url
    private String introduction; // bai gioi thieu
    private LocalDate createDate; // ngay tao san pham
    private boolean deleted;

    // FK to Category
    // Many to One
    private Integer categoryId;

    // FK to Brand
    // Many to One
    private Integer brandId;

    public Product(int id, String name, String model, String code, double price, double promotion_price, boolean sold_out, int guarantee, String image, String introduction, LocalDate createDate, boolean deleted, Integer categoryId, Integer brandId) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.code = code;
        this.price = price;
        this.promotion_price = promotion_price;
        this.sold_out = sold_out;
        this.guarantee = guarantee;
        this.image = image;
        this.introduction = introduction;
        this.createDate = createDate;
        this.deleted = deleted;
        this.categoryId = categoryId;
        this.brandId = brandId;
    }

    public Product(String name, String model, String code, double price, double promotion_price, boolean sold_out, int guarantee, String image, String introduction, LocalDate createDate, boolean deleted) {
        this.name = name;
        this.model = model;
        this.code = code;
        this.price = price;
        this.promotion_price = promotion_price;
        this.sold_out = sold_out;
        this.guarantee = guarantee;
        this.image = image;
        this.introduction = introduction;
        this.createDate = createDate;
        this.deleted = deleted;
    }

    public Product(){

    }

    public int getId() {
        return id;
    }

    public Product setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Product setModel(String model) {
        this.model = model;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Product setCode(String code) {
        this.code = code;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Product setPrice(double price) {
        this.price = price;
        return this;
    }

    public double getPromotion_price() {
        return promotion_price;
    }

    public Product setPromotion_price(double promotion_price) {
        this.promotion_price = promotion_price;
        return this;
    }

    public boolean isSold_out() {
        return sold_out;
    }

    public Product setSold_out(boolean sold_out) {
        this.sold_out = sold_out;
        return this;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public Product setGuarantee(int guarantee) {
        this.guarantee = guarantee;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Product setImage(String image) {
        this.image = image;
        return this;
    }

    public String getIntroduction() {
        return introduction;
    }

    public Product setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public Product setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
        return this;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public Product setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public Product setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public Product setBrandId(Integer brandId) {
        this.brandId = brandId;
        return this;
    }
}
