package com.co.bcp.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.util.MimeTypeUtils;
import org.springframework.http.MediaType;
import static com.co.bcp.controller.ListItemsBuilderDTO.aresponseOne;

import com.co.bcp.dao.Item;
import com.co.bcp.repository.ItemRepository;
import com.co.bcp.service.ItemServiceImp;
import com.fasterxml.jackson.databind.ObjectMapper;

@AutoConfigureMockMvc
@SpringBootTest
public class ItemControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper objectMapper;

	@InjectMocks
	private ItemController mockController;
	
	@Autowired
	  private ItemServiceImp itemService;
	  
	@MockBean
	  private ItemRepository itemRepository;

	
	private static final String URL_TEST = "/tittles?raiting=";
	
	
	@Before(value = "")
	public void setup() {

	}

	@Test
	void findItemLeesRaitingTwo() throws Exception {

		List<Item> listItem = new ArrayList<>();
		listItem = aresponseOne().build();
		
		when(itemRepository.findItemsWithAverageRatingLowerThan(1.9)).thenReturn(listItem);
	    assert itemService.getTitles(1.9).contains("chocolate");
	    assert itemService.getTitles(1.9).contains("sal");


	}
}
