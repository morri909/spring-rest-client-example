package com.spydrone.springrestclientexample.api.domain;

import java.io.Serializable;

public class Name implements Serializable {
	private static final long serialVersionUID = -6874125491332520060L;
	private String title;
	private String first;
	private String last;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}
}
