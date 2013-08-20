package com.ecs.foursquare.model;

import com.google.api.client.util.Key;

import java.io.Serializable;

public class Location  implements Serializable {
	
	private static final long serialVersionUID = -5917868159728094798L;

	@Key
	public java.lang.String address;
	
	@Key
	public java.lang.String city;
	
	@Key
	public java.lang.String state;
	
	@Key
	public java.lang.String postalCode;
	
	@Key
	public java.lang.String country;
	
	@Key
	public double lat;
	
	@Key
	public double lng;
	
	@Key
	public double distance;
	
}
