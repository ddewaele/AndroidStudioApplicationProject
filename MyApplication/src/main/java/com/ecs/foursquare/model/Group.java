package com.ecs.foursquare.model;

import com.google.api.client.util.Key;

import java.io.Serializable;

public class Group implements Serializable {

	private static final long serialVersionUID = 3667889421203126061L;

	@Key
	public Venue[] items;
	
}
