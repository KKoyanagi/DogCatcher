/*
 * 	GameObject.java
 * 
 * 	Abstract class with Animal and Catcher implementing it.
 * 
 * 	Notes:
 * 
 */

package com.mycompany.a1;

import com.codename1.charts.util.ColorUtil;
import java.util.Random;

public abstract class GameObject {
	
	//All objects have Location, Color and Size.
	private float[] location = new float[2]; // x, y location of the center of the object.
	private int color = ColorUtil.rgb(0, 0, 0); //Default color value (black)
	private int size; //Size of the object
	
	public GameObject() {
	}
	
	public abstract void init();
	
	/*
	 * @param float x, float y
	 * Does a check to see if it is a valid location
	 * @returns true if valid location, false if invalid
	 */
	public boolean setLocation(float x, float y) {
		if( (x >= 0 && y >= 0) && ( x <= 1000 && y <= 610) ) {
			location[0] = x;
			location[1] = y;
			return true;
		}
		else 
			return false;
	}
	
	//Set a random location with X min 0, max 1000; y min 0, max 610
	public void setRandomLocation(){
		Random rand = new Random();
		System.out.println(rand.nextInt(1000) + 0);
		setLocation(rand.nextInt(1000) , rand.nextInt(610) );
	}
	
	public float[] getLocation() {
		return location;
	}
	
	public int getColor() {
		return color;
	}
	
	//Protected so accessible to subclass, but not world.
	protected void setColor(int rgbColor) {
		color = rgbColor;
	}
	
	public int getSize() {
		return size;
	}
	
	//Protected so accessible to subclass, but not world.
	protected void setSize(int s){
		size = s;
	}
		
}
