package com.ecs.foursquare.model;

import com.google.api.client.util.Key;

import java.io.Serializable;

public class VenuesList implements Serializable {
	
	private static final long serialVersionUID = -31166334584553076L;

	@Key
	public java.util.List<Venue> items;
}
