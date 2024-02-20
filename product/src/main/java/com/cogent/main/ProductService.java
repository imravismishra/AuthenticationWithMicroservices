package com.cogent.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ServiceClient client;
	
	public OrderResponseDTO orderStatus(int orderId)
	{
		return client.fetchStatus(orderId);
	}
}
