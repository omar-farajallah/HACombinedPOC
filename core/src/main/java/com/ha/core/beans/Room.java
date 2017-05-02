package com.ha.core.beans;

import java.util.ArrayList;

public class Room {

    private ArrayList<String> amenities;
    private long baths;
    private long beds;
    private String description;
    private long minOccupancy;
    private long maxOccupancy;

    public Room(String description, ArrayList<String> amenities, long beds, long baths, long minOccupancy, long maxOccupancy){
        this.description = description;
        this.amenities = amenities;
        this.beds = beds;
        this.baths = baths;
        this.minOccupancy = minOccupancy;
        this.maxOccupancy = maxOccupancy;
    }

    public ArrayList<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(ArrayList<String> amenities) {
        this.amenities = amenities;
    }

    public long getBaths() {
        return baths;
    }

    public void setBaths(long baths) {
        this.baths = baths;
    }

    public long getBeds() {
        return beds;
    }

    public void setBeds(long beds) {
        this.beds = beds;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getMinOccupancy() {
        return minOccupancy;
    }

    public void setMinOccupancy(long minOccupancy) {
        this.minOccupancy = minOccupancy;
    }

    public long getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(long maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

}