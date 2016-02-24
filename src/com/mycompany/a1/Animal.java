/**
 * Animal.java
 * 
 * Superclass to concrete class of specified animals. (E.g., cat and dog)
 * 
 */
package com.mycompany.a1;

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
	protected void setSize(int s){
		setSize(s);
	}
	
	//Protected so accessible to subclass, but not world.
	protected void setColor(int c){
		setColor(c);
	}
	
	public void move(){
		//Implement move here
	}
		

}
