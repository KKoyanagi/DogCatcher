/**
 * 	Animal.java
 * 
 * 	Superclass to concrete class of specified animals. (E.g., cat and dog)
 * 
 * 	Notes: 
 * 		- Still testing the move method, other methods look good.
 */
package com.mycompany.a1;
import java.lang.Math;
import java.util.Random;

public abstract class Animal extends GameObject implements IMoving{
	/* (non-Javadoc)
	 * @see com.mycompany.a1.GameObject#init()
	 */
	
	//All animals have Speed and Direction
	private int speed;
	private int direction;
	
	public Animal(){
	}
	
	@Override
	public abstract void init();
	
	public void setSpeed(int s){
		speed = s;
	}
	
	public void setDirection(int d){
		direction = d;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public int getDirection(){
		return direction;
	}
	
	//Protected so accessible to subclass, but not world.
	//Animals should not be able to set size after created.
	protected void setSize(int s){
		super.setSize(s);
	}
	
	//Protected so accessible to subclass, but not world.
	protected void setColor(int c){
		super.setColor(c);
	}
	
	//Move method
	//TODO test move() method in Animal.java
	public void move(){
		//Retrieve old location
		float[] oldLocation = getLocation();
		Random rand = new Random();
		
		//Small reflection in direction between 5 to 15
		int reflection = rand.nextInt(5) + 1; 
		
		//50% chance of 1 or 0
		if(rand.nextInt(1) == 0) { 
			reflection = reflection * (-1); //negative value half the time
		}
		
		//Change the direction value
		//Direction must be between 0 and 359
		if((direction + reflection) >= 0  && (direction + reflection) <= 359){
			direction = direction + reflection;
		}
		
		float deltaX = (float) Math.cos(90-direction) * speed;
		float deltaY = (float) Math.sin(90-direction) * speed;
		
		boolean indicator = setLocation(deltaX + oldLocation[0], deltaY + oldLocation[1]);
		if(indicator == false) {
			deltaX = (int) Math.cos(90-direction-45) * speed;
			deltaY = (int) Math.sin(90-direction-45) * speed;
			indicator = setLocation(deltaX + oldLocation[0], deltaY + oldLocation[1]);
		}
	}
	
}
