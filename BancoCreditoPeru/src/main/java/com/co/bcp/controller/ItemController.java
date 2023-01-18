package com.co.bcp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.co.bcp.service.ItemServiceImp;

@RestController
public class ItemController implements ItemControllerApi{

	@Autowired
	private ItemServiceImp service;

	public ResponseEntity<?> getTitles(@RequestParam double raiting) throws Exception {

		try {

			return ResponseEntity.ok().body(service.getTitles(raiting));

		} catch (Exception e) {
			throw new Exception("no se encuentran coincidencias con el criterio de busqueda");

		}

	}

}
