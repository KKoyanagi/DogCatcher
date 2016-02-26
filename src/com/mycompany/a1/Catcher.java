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
		super.setSize(s);
	}
	
	//Protected so accessible to subclass, but not world.
	protected void setColor(int c){
		super.setColor(c);
	}
	
	public void moveLeft(){
		//Get location of the catching device
		float[] location = getLocation();
		
		//Check to see if half the size can be moved.
		int halfSize = getSize() / 2;
		if((location[0] - halfSize) > 0){
			setLocation(location[0]-(halfSize), location[1]);
		}
	}
	
	public void moveRight(){
		float[] location = getLocation();
		int halfSize = getSize() / 2;
		if((location[0] + halfSize) < 1000){
			setLocation(location[0]+(halfSize), location[1]);
		}
	}
	
	public void moveUp(){
		float[] location = getLocation();
		int halfSize = getSize() / 2;
		if((location[1] + halfSize) < 610){
			setLocation(location[0], location[1]+(halfSize));
		}
	}
	
	public void moveDown(){
		float[] location = getLocation();
		int halfSize = getSize() / 2;
		if((location[1] - halfSize) > 0){
			setLocation(location[0], location[1]-(halfSize));
		}
	}
}
