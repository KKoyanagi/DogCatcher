/**
 * Catcher.java 
 * 
 * Notes: 
 * 
 */
package com.mycompany.a1;

public abstract class Catcher extends GameObject implements IGuided{

	/* (non-Javadoc)
	 * @see com.mycompany.a1.GameObject#init()
	 */
	
	public Catcher(){
	}
	
	@Override
	public abstract void init();

	//Protected so accessible to subclass, but not world.
	protected void setSize(int s){
		setSize(s);
	}
	
	//Protected so accessible to subclass, but not world.
	protected void setColor(int c){
		setColor(c);
	}
	
	public void moveLeft(){
		float[] location = getLocation();
		int size = getSize();
		if((location[0] - size) > 0){
			setLocation(location[0]-(size/2), location[1]);
		}
	}
	
	public void moveRight(){
		float[] location = getLocation();
		int size = getSize();
		if((location[0] + size) < 1000){
			setLocation(location[0]+(size/2), location[1]);
		}
	}
	
	public void moveUp(){
		float[] location = getLocation();
		int size = getSize();
		if((location[1] + size) < 610){
			setLocation(location[0], location[1]+(size/2));
		}
	}
	
	public void moveDown(){
		float[] location = getLocation();
		int size = getSize();
		if((location[1] - size) > 0){
			setLocation(location[0], location[1]-(size/2));
		}
	}
}
