package com.co.bcp.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "review")
public class Review {

	@Id
	private Long id;

	@Column(name = "tittle")
	private String tittle;

	
public Review() {
		
	}
	public Review(Long id, String tittle) {
		
		this.id = id;
		this.tittle = tittle;
	}
	

	


	public Review(Long id) {
		
		this.id = id;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	
}
