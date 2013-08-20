package com.ecs.foursquare.model;

import com.google.api.client.util.Key;

import java.io.Serializable;

public class FoursquareResponse implements Serializable {

	private static final long serialVersionUID = -383365244692781213L;

	@Key
	public Response response;
	
}
