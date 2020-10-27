package com.theBestBikeShop1;

public class Bicycle {
	
	private int gear;				//these are the variables
	private int speed;
	private boolean lightstatus; //make it boolean cause on and off
	
	Bicycle(){		//default constructor 
	}
	
	public Bicycle(int gear, int speed, boolean lightstatus) {
		this.gear = gear;
		this.speed = speed;
		this.lightstatus = lightstatus; //creating a constructor here
										//to set the gear, speed and light status
	}

	public void setGear(int newValue) {
		gear = newValue;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}
	
	public void switchLightStatus(boolean lightstatus ) {
		if (lightstatus) {
			lightstatus = false;
		} else {
			lightstatus = true;
		}
	}
	
	public void currentState() {
		System.out.println("Gear:" + gear);
		System.out.println("Speed:" + speed);
		System.out.println("Status of light:" + lightstatus);
	}
	}
