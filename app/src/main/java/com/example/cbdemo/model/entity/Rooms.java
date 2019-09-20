package com.example.cbdemo.model.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rooms {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("isOccupied")
    @Expose
    private Boolean isOccupied;

    /**
     * No args constructor for use in serialization
     *
     */
    public Rooms() {
    }

    /**
     *
     * @param id
     * @param createdAt
     * @param name
     * @param isOccupied
     */
    public Rooms(String id, String createdAt, String name, Boolean isOccupied) {
        super();
        this.id = id;
        this.createdAt = createdAt;
        this.name = name;
        this.isOccupied = isOccupied;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(Boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
}
