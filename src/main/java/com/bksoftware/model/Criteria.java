package com.bksoftware.model;

public class Criteria {

    private int id;
    private String name;
    private boolean deleted;
    private Integer criteriaTypeId;

    public Criteria() {
    }

    public Criteria(int id, String name, boolean deleted, Integer criteriaTypeId) {
        this.id = id;
        this.name = name;
        this.deleted = deleted;
        this.criteriaTypeId = criteriaTypeId;
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
                '}';
    }
}
