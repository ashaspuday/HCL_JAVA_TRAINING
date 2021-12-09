package com.dnpass.training.java.objects;

public class ObjectInsideClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			    
			    // create an object of Lamp
		Light led = new Light();

			    // access method using object
			    led.turnOn();
			  }
			
	}




	class Light {
	  
	  // stores the value for light
	  // true if light is on
	  // false if light is off
	  boolean isOn;

	  // method to turn on the light
	  void turnOn() {
	    isOn = true;
	    System.out.println("Light on? " + isOn);

	  }
}
