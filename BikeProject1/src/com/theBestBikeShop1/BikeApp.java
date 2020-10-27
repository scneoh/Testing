package com.theBestBikeShop1;

public class BikeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bicycle = new Bicycle();
		bicycle.speedUp(10);
		bicycle.switchLightStatus(true);
		bicycle.setGear(4);
		bicycle.currentState();
		System.out.println();

		Mountainbike mountBike1= new Mountainbike(3,5, true, true, true); 
		Mountainbike mountBike2= new Mountainbike(6,7, true, true, true);
		mountBike1.currentState();
		System.out.println();
		System.out.println("blabl");
		mountBike2.currentState();
		
	}

}
