/**
 * Net.java
 */
package com.mycompany.a1;


public class Net extends Catcher {

	/* (non-Javadoc)
	 * @see com.mycompany.a1.Catcher#init()
	 */
	
	public Net(){
		init();
	}
	
	@Override
	public void init() {
		//Net size is constrained between 50 and 100. Set at 100 when created.
		setSize(100);
		
		//Set a random location with X min 0, max 1000; y min 0, max 610
		setRandomLocation();
		
		//Color of a net never changes. 
		setColor(40); //Find out the color shit
	}
	
	public void setSize(int s){
		setSize(s);
	}
	
	//Available getter methods to Cat:
			//getColor()
			//getLocation
			//getSize()
}
