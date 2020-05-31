package com.bksoftware.model;

public class Comment {

    private int id;
    private int score;
    private String name;
    private String email;
    private String content;
    private boolean accepted;
    private boolean deleted;
    private Integer productId;

    public Comment() {
    }

    public Comment(int id, int score, String name, String email, String content, boolean accepted, boolean deleted, Integer productId) {
        this.id = id;
        this.score = score;
        this.name = name;
        this.email = email;
        this.content = content;
        this.accepted = accepted;
        this.deleted = deleted;
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
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

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", score=" + score +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", accepted=" + accepted +
                ", deleted=" + deleted +
                ", productId=" + productId +
                '}';
    }
}
