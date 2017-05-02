package com.ha.core.models;

import com.adobe.cq.sightly.WCMUse;
import com.day.cq.commons.jcr.JcrUtil;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;

import javax.jcr.Node;
import javax.jcr.Session;

public class DescriptionInfo extends WCMUse {

    private String description;
    private String shipId;

    @Override
    public void activate() throws Exception {
        shipId = "";
        description = "";
        ValueMap properties = getProperties();
        ResourceResolver resolver = getResourceResolver();
        Session session = resolver.adaptTo(Session.class);
        if (properties.containsKey("shipId")) {
            shipId = properties.get("shipId", String.class);
        }
        if (!shipId.equalsIgnoreCase("")) {
            if (!session.nodeExists("/etc/ship-descriptions/hal/ships/" + shipId)) {
                Node shipNode = JcrUtil.createPath("/etc/ship-descriptions/hal/ships/" + shipId, "nt:unstructured", session);
                Node descriptionNode = shipNode.addNode(shipId);
                descriptionNode.setProperty("description", properties.get("shipDescription", String.class));
            }
            Node shipDescriptionNode = session.getNode("/etc/ship-descriptions/hal/ships/" + shipId);
            description = shipDescriptionNode.getProperty("description").getString();
            shipDescriptionNode.setProperty("description", properties.get("shipDescription", String.class));
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

}
