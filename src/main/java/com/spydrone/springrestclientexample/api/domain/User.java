package com.spydrone.springrestclientexample.api.domain;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = -644276452569471116L;
	private String gender;
	private Name name;
	private Location location;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}
