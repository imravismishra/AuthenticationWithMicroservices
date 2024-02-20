package com.cogent.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/{orderId}")
	public OrderResponseDTO checkOrderStatus(@PathVariable int orderId)
	{
		return service.orderStatus(orderId);
	}

}
