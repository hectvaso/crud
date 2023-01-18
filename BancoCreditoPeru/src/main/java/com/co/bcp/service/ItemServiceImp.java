package com.co.bcp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.bcp.dao.Item;
import com.co.bcp.repository.ItemRepository;

@Service
public class ItemServiceImp implements ItemServiceInter {

	@Autowired
	private ItemRepository repository;

	@Override
	public List<String> getTitles(double raiting) {

		List<Item> itemes = new ArrayList<Item>();
		List<Item> itemesOutReview = new ArrayList<Item>();
		List<String> itemesRaiting = new ArrayList<>();

		itemes = repository.findItemsWithAverageRatingLowerThan(raiting);

		itemes.forEach(elem -> {

			if (elem.getReview() == null) {
				elem.setRaiting(0);
			}
			if (elem.getRaiting() < raiting) {
				itemesRaiting.add(elem.getTittles());

			}
			itemesOutReview.add(elem);
		});

		repository.deleteAll();

		repository.saveAll(itemesOutReview);
		return itemesRaiting;

	}

}
