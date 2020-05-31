package com.bksoftware.model;

public class Criteria {

    private int id;
    private String name;
    private boolean deleted;
    private Integer criteriaTypeId;
    private Integer productId;

    public Criteria() {
    }

    public Criteria(int id, String name, boolean deleted, Integer criteriaTypeId, Integer productId) {
        this.id = id;
        this.name = name;
        this.deleted = deleted;
        this.criteriaTypeId = criteriaTypeId;
        this.productId = productId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getCriteriaTypeId() {
        return criteriaTypeId;
    }

    public void setCriteriaTypeId(Integer criteriaTypeId) {
        this.criteriaTypeId = criteriaTypeId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Criteria{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deleted=" + deleted +
                ", criteriaTypeId=" + criteriaTypeId +
                ", productId=" + productId +
                '}';
    }
}
