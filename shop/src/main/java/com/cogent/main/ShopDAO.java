package com.cogent.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ShopDAO {

	public HashMap<String, String> getOrder(int orderId) {
		return generateOrder().get(orderId - 1);
	}

	public List<HashMap<String, String>> generateOrder() {
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("id", "1");
		map1.put("name", "laptop");
		map1.put("price", "56000");

		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("id", "2");
		map2.put("name", "Pencil");
		map2.put("price", "5");

		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("id", "3");
		map3.put("name", "Computer");
		map3.put("price", "6000");

		HashMap<String, String> map4 = new HashMap<String, String>();
		map4.put("id", "4");
		map4.put("name", "Mobile");
		map4.put("price", "5000");

		List<HashMap<String, String>> data = new ArrayList<HashMap<String, String>>();
		data.add(map1);
		data.add(map2);
		data.add(map3);
		data.add(map4);

		return data;
	}

}
