package com.cogent.main;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService {

	@Autowired
	private ShopDAO shopDAO;

	public HashMap<String, String> getOrder(int orderId) {
		// instead of making call to the repository
		// we are using static data from dao
		return shopDAO.getOrder(orderId);

	}
}
