/**
 * Cat.java
 * 
 * Concrete class extending Animal class
 */
package com.mycompany.a1;

import java.util.Random;

import com.codename1.charts.util.ColorUtil;

public class Cat extends Animal {

	/* (non-Javadoc)
	 * @see com.mycompany.a1.Animal#init()
	 */
	public Cat(){
		init();
	}
	
	@Override
	public void init() {
		Random rand = new Random();
		
		//Set a random size
		setSize(rand.nextInt(30) + 15); //30 is max and 15 is minimum 
		
		//Set a random location with X min 0, max 1000; y min 0, max 610
		setRandomLocation();
		
		//Speed of cat is 5
		setSpeed(5);
		
		//Color never changes. Set a default.
		setColor(ColorUtil.rgb(255, 204, 229)); //Don't know what 30 is... Check the documentation

		//Direction initialized as random. (0 to 359) at instantiation
		setDirection(rand.nextInt(359) + 0);
	}
	
	//Available getter methods to Cat:
	//getColor()
	//getLocation
	//getSize()
	//getSpeed()
	//getDirection()
}
