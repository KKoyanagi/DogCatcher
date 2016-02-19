package com.mycompany.a1;

import com.codename1.charts.util.ColorUtil;
import java.util.Random;

public abstract class GameObject {
	
	private float[] location = new float[2]; // x, y location of the center of the object.
	protected static int color = ColorUtil.rgb(0, 0, 0); //Default color value
	protected int size;
	
	public GameObject() {
		
	}
	
	public void setLocation(float x, float y) {
		location[0] = x;
		location[1] = y;
	}
	
	public float[] getLocation() {
		return location;
	}
	
	public int getColor() {
		return color;
	}
	
	public abstract void setColor(int rgbColor);  //Should be abstract 
	
	public int getSize() {
		return size;
	}
	
	public abstract void setSize(int s); //Should be abstract 
		
}
