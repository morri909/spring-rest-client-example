package com.spydrone.springrestclientexample.api.domain;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = -644276452569471116L;
	private String city;
	private String name;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"city='" + city + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
