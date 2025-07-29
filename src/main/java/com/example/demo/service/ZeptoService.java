package com.example.demo.service;

public class ZeptoService implements FoodService{

	@Override
	public void pickOrderFromHotel() {
		System.out.println("Zepto : Picking order From hotel");
		
	}

	@Override
	public void processOrderFromHotel() {
		System.out.println("Zepto : Processing Order\"");
		
	}

	@Override
	public void findLocationForDelivery() {
		System.out.println("Zepto : Finding location for delivery ");
		
	}

	@Override
	public String deliverOrder() {
		
		return "Zepto : Order Has-Been Delivered by Zepto successfully in 10 Mins";
	}

}
