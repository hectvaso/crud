package com.co.bcp.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.json.ParseException;

public class ListTittlesBuilderDTO {

	private List<String>listTittles;
	
	public ListTittlesBuilderDTO() {
		
		listTittles = new ArrayList<>();
		
		}
	public ListTittlesBuilderDTO whithRaitingIsOnePointNine() {
		
		listTittles.add("sal");
		listTittles.add("chocolate");
		listTittles.add("mantequilla");
		
		
		return this;
	}

public ListTittlesBuilderDTO whithRaitingIsThreePointThree(double raiting) {
		
		listTittles.add("leche");
		listTittles.add("sal");
		listTittles.add("queso");
		listTittles.add("chocolate");
		listTittles.add("mantequilla");
		
		
		return this;
	}

public static ListTittlesBuilderDTO aresponseOne() throws ParseException {
	  return new ListTittlesBuilderDTO();
}
	
}
