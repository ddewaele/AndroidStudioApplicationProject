package com.ecs.foursquare.model;

import com.google.api.client.util.Key;

import java.io.Serializable;

public class Category  implements Serializable {
	
	private static final long serialVersionUID = -4553521178456858700L;

	@Key
	public java.lang.String id;
	
	@Key
	public java.lang.String name;
	
	@Key
	public java.lang.String pluralName;
	
	@Key
	public java.lang.String icon;
	
	@Key
	public String[] parents;
	
	@Key
	public boolean primary;
	
}
