package com.bksoftware.model;

import java.time.LocalDate;

//table product_view
public class ProductView {
    private int id;
    private int view;
    private LocalDate viewDate;
    private Integer productId;

    public ProductView(int id, int view, LocalDate viewDate, Integer productId) {
        this.id = id;
        this.view = view;
        this.viewDate = viewDate;
        this.productId = productId;
    }

    public ProductView(){

    }

    public int getId() {
        return id;
    }

    public ProductView setId(int id) {
        this.id = id;
        return this;
    }

    public int getView() {
        return view;
    }

    public ProductView setView(int view) {
        this.view = view;
        return this;
    }

    public LocalDate getViewDate() {
        return viewDate;
    }

    public ProductView setViewDate(LocalDate viewDate) {
        this.viewDate = viewDate;
        return this;
    }

    public Integer getProductId() {
        return productId;
    }

    public ProductView setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }
}
