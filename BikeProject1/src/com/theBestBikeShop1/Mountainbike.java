package com.theBestBikeShop1;

public class Mountainbike extends Bicycle{

	private boolean suspensionFront;
	private boolean suspensionRear;
	
	public Mountainbike() {	
	} //the default constructor
	
	public Mountainbike (int gear, int speed, boolean lightstatus, boolean suspensionFront, boolean suspensionRear) {
		super(gear, speed, lightstatus); //super is basically getting the same variables from the parent class
		this.suspensionFront = suspensionFront;
		this.suspensionRear = suspensionRear;
	}
	
	public boolean isFullSuspension() {
		if(suspensionFront && suspensionRear) {
			return true;
			}else {
				return false;
			}
		
	}
	
	@Override
	public void currentState() { //override the same method but use different input
		super.currentState();
		System.out.println("Suspension (Front):" + suspensionFront);
		System.out.println("Suspension (Rear):" + suspensionRear);
	}
	


	
}
