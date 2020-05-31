package com.bksoftware.model;

public class UserLikeProduct {

    // FK many to one User
    private int userId;

    // FK many to one Product
    private int productId;

    private boolean deleted;

    public UserLikeProduct(int userId, int productId, boolean deleted) {
        this.userId = userId;
        this.productId = productId;
        this.deleted = deleted;
    }

    public UserLikeProduct() {
    }

    public int getUserId() {
        return userId;
    }

    public UserLikeProduct setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getProductId() {
        return productId;
    }

    public UserLikeProduct setProductId(int productId) {
        this.productId = productId;
        return this;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public UserLikeProduct setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }
}
