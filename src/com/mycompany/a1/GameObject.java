package com.mycompany.a1;

public abstract class GameObject {
	
	float[] location = new float[2]; // x, y location of the center of the object.
	int color; 
	int size;
	
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
	
	public abstract void setColor();
	
	public int getSize() {
		return size;
	}
	
	public abstract void setSize();
	
}
