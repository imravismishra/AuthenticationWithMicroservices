package com.cogent.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceClient {
	
	@Autowired
	private RestTemplate template;
	
	public OrderResponseDTO fetchStatus(int orderId)
	{
		return template.getForObject("http://localhost:8082/shopapi/order/status/"+orderId, OrderResponseDTO.class);
	}

}
