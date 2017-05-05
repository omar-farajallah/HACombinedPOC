package com.ha.core.models;

import com.adobe.cq.sightly.WCMUse;
import org.apache.jackrabbit.commons.JcrUtils;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;

import javax.jcr.Node;
import javax.jcr.Session;

public class ShipAuthor extends WCMUse {

    private String description;
    private String shipId;
    private String name;
    private String imageUrl;
    private String videoUrl;
    private String virtualTourUrl;

    @Override
    public void activate() throws Exception {
        shipId = "";
        description = "";
        name = "";
        imageUrl = "";
        videoUrl = "";
        virtualTourUrl = "";
        ValueMap properties = getProperties();
        ResourceResolver resolver = getResourceResolver();
        Session session = resolver.adaptTo(Session.class);
        if (properties.containsKey("shipId")) {
            shipId = properties.get("shipId", String.class);
        }
        if (!shipId.equalsIgnoreCase("")) {
            if (!session.nodeExists("/etc/ship-authored-data/hal/ships/" + shipId)) {
                Node shipNode = JcrUtils.getOrCreateByPath("/etc/ship-authored-data/hal/ships/", "nt:unstructured",  session);
                Node authorNode = shipNode.addNode(shipId);
                authorNode.setProperty("description", properties.get("shipDescription", String.class));
                authorNode.setProperty("name", properties.get("shipName", String.class));
                authorNode.setProperty("imageUrl", properties.get("shipImageUrl", String.class));
                authorNode.setProperty("videoUrl", properties.get("shipVideoUrl", String.class));
                authorNode.setProperty("virtualTourUrl", properties.get("shipVirtualTourUrl", String.class));
                session.save();
            }
            Node shipDescriptionNode = session.getNode("/etc/ship-authored-data/hal/ships/" + shipId);
            description = shipDescriptionNode.getProperty("description").getString();
            name = shipDescriptionNode.getProperty("name").getString();;
            imageUrl = shipDescriptionNode.getProperty("imageUrl").getString();;
            videoUrl = shipDescriptionNode.getProperty("videoUrl").getString();;
            virtualTourUrl = shipDescriptionNode.getProperty("virtualTourUrl").getString();;
            shipDescriptionNode.setProperty("description", properties.get("shipDescription", String.class));
            shipDescriptionNode.setProperty("name", properties.get("shipName", String.class));
            shipDescriptionNode.setProperty("imageUrl", properties.get("shipImageUrl", String.class));
            shipDescriptionNode.setProperty("videoUrl", properties.get("shipVideoUrl", String.class));
            shipDescriptionNode.setProperty("virtualTourUrl", properties.get("shipVirtualTourUrl", String.class));
            session.save();
        }
    }

    public String getShipId() {
        return shipId;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
