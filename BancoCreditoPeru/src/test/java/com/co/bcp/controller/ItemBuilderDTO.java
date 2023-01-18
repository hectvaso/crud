package com.co.bcp.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.json.ParseException;

import com.co.bcp.dao.Item;
import com.co.bcp.dao.Review;

public class ItemBuilderDTO {

	private Item item;
	
	public ItemBuilderDTO() {
		
		item = new Item();
		item.setIdItem(1L);
		item.setProductCode(100);
		item.setTittles("leche");
		item.setPriceSale(200);
		item.setStock(10);
		item.setRaiting(3.2);
		item.setReview(new Review(1L));
		
		
		}
	

public ItemBuilderDTO two() {
		
		this.item.setIdItem(2L);
		this.item.setProductCode(200);
		this.item.setTittles("azucar");
		this.item.setPriceSale(200);
		this.item.setStock(15);
		this.item.setRaiting(5.5);
		this.item.setReview(new Review(1L));
		
		
		return this;
	}





public static ItemBuilderDTO aItemBuiderRespoonse() throws ParseException {
	  return new ItemBuilderDTO();
}
	
}
