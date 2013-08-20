package com.ecs.foursquare.model;

import com.google.api.client.util.Key;

import java.io.Serializable;

public class Venue implements Serializable {

	private static final long serialVersionUID = 7011532850140949409L;

	@Key
	public java.lang.String id;
	
	@Key
	public java.lang.String name;
	
	@Key
	public java.lang.String itemId;
	
	@Key
	public Location location;
	
	@Key
	public Category[] categories;
	
	@Key
	public boolean verified;
	
	@Key
	public Statistics stats;
	
	@Key
	public HereNow hereNow;

}
