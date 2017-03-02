package com.ha.core.models;

import org.apache.sling.api.resource.ValueMap;

import com.adobe.cq.sightly.WCMUse;

public class HAContent extends WCMUse {

	private String message;
	
	@Override
	public void activate() throws Exception {
		ValueMap properties = getProperties();
		message = "No message set.";
		if (properties.containsKey("title")) {
			message = properties.get("title", String.class);
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}