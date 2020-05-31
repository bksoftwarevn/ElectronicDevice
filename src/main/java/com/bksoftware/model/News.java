package com.bksoftware.model;

public class News {
    private int id;
    private String title;
    private String content;
    private String image;

    // FK to Topic
    // Many to One
    private Integer topicID;

    //CONSTRUCTOR

    public News(int id, String title, String content, String image, int topicID) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.image = image;
        this.topicID = topicID;
    }

    public News(int id, String title, String content, String image) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.image = image;
    }

    public News() {
    }

    // GETTER & SETTER
    public int getId() {
        return id;
    }

    public News setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public News setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public News setContent(String content) {
        this.content = content;
        return this;
    }

    public String getImage() {
        return image;
    }

    public News setImage(String image) {
        this.image = image;
        return this;
    }

    public int getTopicID() {
        return topicID;
    }

    public News setTopicID(int topicID) {
        this.topicID = topicID;
        return this;
    }
}

