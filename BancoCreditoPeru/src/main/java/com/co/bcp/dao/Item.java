package com.co.bcp.dao;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idItem;

	@Column(name = "product_code")
	private Integer productCode;

	@Column(name = "tittle")
	private String tittle;

	@Column(name = "price_sale")
	private Integer priceSale;

	@Column(name = "stock")
	private Integer stock;;

	@Column(name = "raiting")
	private double raiting;;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private Review review;

	
	
	public Item() {
		
	}

	public Item(Long idItem, Integer productCode, String tittle, Integer priceSale, Integer stock, double raiting,Long review) {
		
		this.idItem = idItem;
		this.productCode = productCode;
		this.tittle = tittle;
		this.priceSale = priceSale;
		this.stock = stock;
		this.raiting = raiting;
		this.review.setId(review);
	}

public Item(Long idItem, Integer productCode, String tittle, Integer priceSale, Integer stock, double raiting) {
		
		this.idItem = idItem;
		this.productCode = productCode;
		this.tittle = tittle;
		this.priceSale = priceSale;
		this.stock = stock;
		this.raiting = raiting;
		
}
	public Long getIdItem() {
		return idItem;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	public Integer getProductCode() {
		return productCode;
	}

	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}

	public String getTittles() {
		return tittle;
	}

	public void setTittles(String tittles) {
		this.tittle = tittles;
	}

	public Integer getPriceSale() {
		return priceSale;
	}

	public void setPriceSale(Integer priceSale) {
		this.priceSale = priceSale;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public double getRaiting() {
		return raiting;
	}

	public void setRaiting(double raiting) {
		this.raiting = raiting;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	// template.update("INSERT INTO Item (id_item,product_code,
	// tittle,price_sale,stock,raiting,id) VALUES (1,100,'leche',200,10,3.2,1)");

}
