/**
 * Dog.java
 * 
 * Concrete class extending Animal class
 * 
 */
package com.mycompany.a1;

import java.util.Random;

import com.codename1.charts.util.ColorUtil;

public class Dog extends Animal {
	/* (non-Javadoc)
	 * @see com.mycompany.a1.Animal#init()
	 */
	
	//Dog has scratches 
	private int scratches;
	
	public Dog(){
		init();
	}
	
	@Override
	public void init() {
		Random rand = new Random();
		
		//Dog starts with 0 scratches
		scratches = 0;
		
		//Set a random size
		setSize(rand.nextInt(50) + 20); //50 is max and 1 is minimum 

		//Set a random location with X min 0, max 1000; y min 0, max 610
		setRandomLocation();
		
		//Initialize dogs as a specific color
		setColor(ColorUtil.rgb(255, 153, 51)); //No idea what 500 is, look at CodeName One documentation later
		
		//Speed is range 0-5, starts at 5;
		setSpeed(5);
		
		//Direction initialized as random. (0 to 359) at instantiation
		setDirection(rand.nextInt(359) + 0);
	}
	
	public void setScratches(int s){
		if(s >= 0 && s <= 5)
			scratches = s;
	}
	
	public int getScratches() {
		return scratches;
	}
	
	public void setColor(int c){
		setColor(c);
	}
	
	public void addScratch(){
		if(scratches < 5) {
			scratches++;
			setColor(ColorUtil.rgb(265, 153, 51)); //Increase the redness, change later
			//TODO change the redness as an increment
			setSpeed(getSpeed()-1);
		}
	}
	
	//Available getter methods to Dog:
		//getColor()
		//getLocation
		//getSize()
		//getSpeed()
		//getDirection()
}
