package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.factory.Factory;
import com.example.demo.service.FoodService;

@RestController
public class FoodController {

	@GetMapping("order/{type}")
	public String handeleOrder(@PathVariable String type) {
		FoodService fs = Factory.getService(type);
		fs.pickOrderFromHotel();
		fs.processOrderFromHotel();
		fs.findLocationForDelivery();
		return fs.deliverOrder();
	}
}
