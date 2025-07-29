package com.example.demo.service;

public class SwiggyService implements FoodService {

	@Override
	public void pickOrderFromHotel() {

		System.out.println(" Swiggy :Picking order From hotel");
	}

	@Override
	public void processOrderFromHotel() {

		System.out.println("Swiggy :Processing Order");
	}

	@Override
	public void findLocationForDelivery() {

		System.out.println("Swiggy :Finding location for delivery ");
	}

	@Override
	public String deliverOrder() {

		return "Swiggy : Order Has-Been Delivered by Swiggy successfully in 10 Mins";
	}

}
