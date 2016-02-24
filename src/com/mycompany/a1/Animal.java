/**
 * Animal.java
 * 
 * Superclass to concrete class of specified animals. (E.g., cat and dog)
 * 
 */
package com.mycompany.a1;
import java.lang.Math;
import java.util.Random;

import com.codename1.contacts.ContactsManager;

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
		setSize(s);
	}
	
	//Protected so accessible to subclass, but not world.
	protected void setColor(int c){
		setColor(c);
	}
	
	public void move(){
		float[] oldLocation = getLocation();
		Random rand = new Random();
		int reflection = rand.nextInt(15) + 5; //Change in direction
		if(rand.nextInt(1) == 0)
			reflection = reflection * (-1); //negative value half the time
		int deltaX = (int) Math.cos(90-direction+reflection) * speed;
		int deltaY = (int) Math.sin(90-direction+reflection) * speed;
		
		//Might want to make this a loop later on.
		if(!setLocation(deltaX + oldLocation[0], deltaY + oldLocation[1])) {
			deltaX = (int) Math.cos(90-direction-45) * speed;
			deltaY = (int) Math.sin(90-direction-45) * speed;
		}

	}
		

}
