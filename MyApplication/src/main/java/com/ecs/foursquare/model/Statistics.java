package com.ecs.foursquare.model;

import com.google.api.client.util.Key;

import java.io.Serializable;

public class Statistics  implements Serializable {

	private static final long serialVersionUID = 8568821541735450666L;
	
	@Key
	public int checkinsCount;
	@Key
	public int usersCount;
	@Key
	public int tipCount;
}
