package com.test;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="8D_movie")
//@DiscriminatorValue("8D")
public class Movie_8D extends Movie{
	
	private String direcor;

	public String getDirecor() {
		return direcor;
	}

	public void setDirecor(String direcor) {
		this.direcor = direcor;
	}
	
}
