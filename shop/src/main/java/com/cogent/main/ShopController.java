package com.cogent.main;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopapi")
public class ShopController {

	@Autowired
	private ShopService service;

	@GetMapping("/order/status/{orderId}")
	public OrderResponseDTO getOrder(@PathVariable("orderId") int orderId) {
		
		HashMap<String, String> response = service.getOrder(orderId);
		
		return OrderResponseDTO.builder()
				.orderId(Integer.parseInt(response.get("id")))
				.name(response.get("name"))
				.price(Double.parseDouble( response.get("price")))
				.build();
	}

}
