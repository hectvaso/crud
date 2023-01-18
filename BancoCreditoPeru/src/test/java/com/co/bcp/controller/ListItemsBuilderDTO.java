package com.co.bcp.controller;

import java.util.ArrayList;
import java.util.List;



import org.apache.tomcat.util.json.ParseException;

import com.co.bcp.dao.Item;

import static com.co.bcp.controller.ItemBuilderDTO.aItemBuiderRespoonse;

public class ListItemsBuilderDTO {

	private List<Item>listItem;
	private Item item;
	private Item itemOne;
	private Item itemTwo;
	
	
	public ListItemsBuilderDTO() {
		
		listItem = new ArrayList<>();
		item = new Item(8L,400,"chocolate",200,15,3.1);
		itemOne = new Item(10L,600,"mantequilla",200,15,2.3);
		itemTwo = new Item(4L,400,"sal",200,15,3.1);
		
				
	}
	
	public List<Item>build(){
		listItem.add(this.item);
		listItem.add(this.itemOne);
		listItem.add(this.itemTwo);
		
		return listItem;
			
	}


public static ListItemsBuilderDTO aresponseOne() throws ParseException {
	  return new ListItemsBuilderDTO();
}
	
}
