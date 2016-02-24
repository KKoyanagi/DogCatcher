/**
 * Catcher.java 
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
		
	}
	
	public void moveRight(){
		
	}
	
	public void moveUp(){
		
	}
	
	public void moveDown(){
		
	}
	
	public void jumpToDog(){
		
	}
	
	public void jumpToCat(){
		
	}
}
