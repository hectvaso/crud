package com.co.bcp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class BancoCreditoPeruApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(BancoCreditoPeruApplication.class, args);
	}

	 @Override
	    public void run(String... args) throws Exception {
		 
		 template.update("INSERT INTO review (id,tittle) VALUES (1,'review one')");
		 template.update("INSERT INTO Item (id_item,product_code, tittle,price_sale,stock,raiting,id) VALUES (1,100,'leche',200,10,3.2,1)");
	     template.update("INSERT INTO Item (id_item,product_code, tittle,price_sale,stock,raiting,id) VALUES (2,200,'azucar',200,15,5.5,1)");
	     template.update("INSERT INTO Item (id_item,product_code, tittle,price_sale,stock,raiting,id) VALUES (3,300,'cafe',200,15,8.7,1)");
	     template.update("INSERT INTO Item (id_item,product_code, tittle,price_sale,stock,raiting) VALUES 	 (4,400,'sal',200,15,3.1)");
	     template.update("INSERT INTO Item (id_item,product_code, tittle,price_sale,stock,raiting,id) VALUES (5,500,'arroz',200,15,4.5,1)");
	     template.update("INSERT INTO Item (id_item,product_code, tittle,price_sale,stock,raiting,id) VALUES (6,600,'queso',200,15,2.3,1)");
	     template.update("INSERT INTO Item (id_item,product_code, tittle,price_sale,stock,raiting,id) VALUES (7,300,'pan',200,15,8.7,1)");
	     template.update("INSERT INTO Item (id_item,product_code, tittle,price_sale,stock,raiting) VALUES 	 (8,400,'chocolate',200,15,3.1)");
	     template.update("INSERT INTO Item (id_item,product_code, tittle,price_sale,stock,raiting,id) VALUES (9,500,'carne',200,15,4.5,1)");
	     template.update("INSERT INTO Item (id_item,product_code, tittle,price_sale,stock,raiting) VALUES    (10,600,'mantequilla',200,15,2.3)");
	     
	 }

	
}
