package com.bksoftware.model;


public class ProductHasCriteria {
    private Integer productId;
    private Integer criteriaId;
    private boolean deleted;

    public ProductHasCriteria(Integer productId, Integer criteriaId, boolean deleted) {
        this.productId = productId;
        this.criteriaId = criteriaId;
        this.deleted = deleted;
    }

    public ProductHasCriteria() {
    }

    public Integer getProductId() {
        return productId;
    }

    public ProductHasCriteria setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public Integer getCriteriaId() {
        return criteriaId;
    }

    public ProductHasCriteria setCriteriaId(Integer criteriaId) {
        this.criteriaId = criteriaId;
        return this;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public ProductHasCriteria setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }
}
