package com.ecs.foursquare.model;

import com.google.api.client.util.Key;

import java.io.Serializable;

public class Response  implements Serializable {

	private static final long serialVersionUID = -8744243204974447941L;

	@Key
	public Group[] groups;
	
}
