package com.bksoftware.model;

public class Specification {
    private int id;
    private String name;
    private String value;
    private boolean deleted;

    private int productId;

    public Specification(int id, String name, String value, boolean deleted, int productId) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.deleted = deleted;
        this.productId = productId;
    }

    public Specification(String name, String value, boolean deleted) {
        this.name = name;
        this.value = value;
        this.deleted = deleted;
    }

    public Specification(){

    }

    public String getName() {
        return name;
    }

    public Specification setName(String name) {
        this.name = name;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Specification setValue(String value) {
        this.value = value;
        return this;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public Specification setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public int getProductId() {
        return productId;
    }

    public Specification setProductId(int productId) {
        this.productId = productId;
        return this;
    }
}
