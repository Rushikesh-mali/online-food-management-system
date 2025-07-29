package com.example.demo.service;

public class ZomatoService implements FoodService {

	@Override
	public void pickOrderFromHotel() {

		System.out.println("Zomato : Picking order From hotel");
	}

	@Override
	public void processOrderFromHotel() {

		System.out.println("Zomato: Processing Order ");
	}

	@Override
	public void findLocationForDelivery() {

		System.out.println("Zomato : Finding location for delivery");
	}

	@Override
	public String deliverOrder() {

		return "Zoamato : Order Has-Been Delivered by Zomato successfully in 10 Mins";
	}

}
