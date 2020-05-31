package com.bksoftware.model;

public class ImageGallary {

    private int id;
    private String url;
    private boolean deleted;
    private Integer productId;
    private Integer newsId;

    public ImageGallary() {
    }

    public ImageGallary(int id, String url, boolean deleted, Integer productId, Integer newsId) {
        this.id = id;
        this.url = url;
        this.deleted = deleted;
        this.productId = productId;
        this.newsId = newsId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    @Override
    public String toString() {
        return "ImageGallary{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", deleted=" + deleted +
                ", productId=" + productId +
                ", newsId=" + newsId +
                '}';
    }
}
