package com.ha.core.beans;

public class Ship {

    private String name;
    private Room room;
    private String description;
    private String imageUrl;
    private String videoUrl;
    private String virtualTourUrl;
    private long cabins;
    private long crew;
    private long guests;
    private long length;
    private long width;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCabins() {
        return cabins;
    }

    public void setCabins(long cabins) {
        this.cabins = cabins;
    }

    public long getCrew() {
        return crew;
    }

    public void setCrew(long crew) {
        this.crew = crew;
    }

    public long getGuests() {
        return guests;
    }

    public void setGuests(long guests) {
        this.guests = guests;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVirtualTourUrl() {
        return virtualTourUrl;
    }

    public void setVirtualTourUrl(String virtualTourUrl) {
        this.virtualTourUrl = virtualTourUrl;
    }
}