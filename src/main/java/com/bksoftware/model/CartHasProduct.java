package com.bksoftware.model;

public class CartHasProduct {

    private Integer productId;
    private Integer cardId;
    private int quantity;
    private boolean deleted;

    public CartHasProduct() {
    }

    public CartHasProduct(Integer productId, Integer cardId, int quantity, boolean deleted) {
        this.productId = productId;
        this.cardId = cardId;
        this.quantity = quantity;
        this.deleted = deleted;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "CartHasProduct{" +
                "productId=" + productId +
                ", cardId=" + cardId +
                ", quantity=" + quantity +
                ", deleted=" + deleted +
                '}';
    }
}
