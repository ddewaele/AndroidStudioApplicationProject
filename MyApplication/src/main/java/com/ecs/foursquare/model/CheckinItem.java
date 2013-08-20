package com.ecs.foursquare.model;

import com.google.api.client.util.Key;

import java.io.Serializable;

public class CheckinItem implements Serializable {

	private static final long serialVersionUID = -6210250259719738812L;

	@Key
	public java.lang.String id;
	
	@Key
	public long createdAt;
	
	@Key
	public java.lang.String type;
	
	@Key
	public java.lang.String timeZone;
	
	@Key
	public Venue venue;
	
}
