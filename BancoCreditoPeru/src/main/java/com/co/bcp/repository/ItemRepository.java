package com.co.bcp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.co.bcp.dao.Item;


@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM item")
	public List<Item> findItemsWithAverageRatingLowerThan(@Param("raiting") double raiting);

}
