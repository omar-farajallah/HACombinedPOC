package com.ha.core.models;

import com.adobe.cq.sightly.WCMUse;
import com.ha.core.beans.Room;
import com.ha.core.beans.Ship;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;

import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.Session;
import javax.jcr.Value;
import java.util.ArrayList;
import java.util.Arrays;

public class CombinedInfo extends WCMUse {

    private String shipId;

    private Ship ship;

    private ArrayList<Room> rooms;

    @Override
    public void activate() throws Exception {
        ValueMap properties = getProperties();
        shipId = "";
        rooms = new ArrayList<Room>();
        if (properties.containsKey("shipId")) {
            shipId = properties.get("shipId", String.class);
        }
        if (!shipId.equalsIgnoreCase("")) {
            ResourceResolver resolver = getResourceResolver();
            Session session = resolver.adaptTo(Session.class);
            Node shipInfoNode = session.getNode("/etc/combined/hal/ships/" + shipId);

            ship = new Ship();
            ship.setCabins(shipInfoNode.getProperty("cabins").getLong());
            ship.setCrew(shipInfoNode.getProperty("crew").getLong());
            ship.setGuests(shipInfoNode.getProperty("guests").getLong());
            ship.setLength(shipInfoNode.getProperty("length").getLong());
            ship.setWidth(shipInfoNode.getProperty("width").getLong());

            if (session.nodeExists("/etc/combined/hal/ships/" + shipId)) {
                Node descriptionNode = session.getNode("/etc/combined/hal/ships/" + shipId);
                ship.setDescription(descriptionNode.getProperty("description").getString());
                ship.setImageUrl(descriptionNode.getProperty("imageUrl").getString());
                ship.setVideoUrl(descriptionNode.getProperty("videoUrl").getString());
                ship.setVirtualTourUrl(descriptionNode.getProperty("virtualTourUrl").getString());
                ship.setName(descriptionNode.getProperty("name").getString());
            } else {
                ship.setDescription("No description set");
            }

            NodeIterator ni = shipInfoNode.getNode("rooms").getNodes();
            while (ni.hasNext()) {
                Node roomNode = ni.nextNode();
                ArrayList<Value> amenitiesValue = new ArrayList<Value>(Arrays.asList(roomNode.getProperty("amenities").getValues()));
                ArrayList<String> amenitiesList = new ArrayList<String>();
                for (Value v : amenitiesValue) {
                    amenitiesList.add(v.getString());
                }
                rooms.add(new Room(roomNode.getProperty("description").getString(), amenitiesList, roomNode.getProperty("beds").getLong(), roomNode.getProperty("baths").getLong(), roomNode.getProperty("minOccupancy").getLong(), roomNode.getProperty("maxOccupancy").getLong()));
            }
        }
    }

    public String getShipId() {
        return shipId;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}
