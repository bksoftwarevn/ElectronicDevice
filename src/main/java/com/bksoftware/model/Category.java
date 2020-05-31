package com.bksoftware.model;

public class Category {

    private int id;
    private String name;
    private int level;
    private boolean smallest;
    private boolean deleted;
    private Integer categoryId;

    public Category() {
    }

    public Category(int id, String name, int level, boolean smallest, boolean deleted, Integer categoryId) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.smallest = smallest;
        this.deleted = deleted;
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isSmallest() {
        return smallest;
    }

    public void setSmallest(boolean smallest) {
        this.smallest = smallest;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", smallest=" + smallest +
                ", deleted=" + deleted +
                ", categoryId=" + categoryId +
                '}';
    }
}
