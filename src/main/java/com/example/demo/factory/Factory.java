package com.example.demo.factory;

import com.example.demo.service.FoodService;
import com.example.demo.service.SwiggyService;
import com.example.demo.service.ZeptoService;
import com.example.demo.service.ZomatoService;

public class Factory {
	public static FoodService getService(String type) {

		if (type.equals("Zepto")) {
			return new ZeptoService();

		}

		if (type.equals("Swiggy")) {
			return new SwiggyService();
		}

		if (type.equals("Zomato")) {
			return new ZomatoService();

		}

		return null;

	}
}
