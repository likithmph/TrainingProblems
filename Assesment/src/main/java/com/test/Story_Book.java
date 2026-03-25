package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Table(name="storybooks")
public class Story_Book extends Books{
	private String pages;

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}
	
}
