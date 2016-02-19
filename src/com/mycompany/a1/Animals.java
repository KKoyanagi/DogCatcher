package com.mycompany.a1;

public abstract class Animals extends GameObject {
	
	int speed, direction;
	int scratches = 0;
	
	public Animals() {
		
	}
	
	public abstract void moveUp();
	public abstract void moveDown();
	public abstract void moveLeft();
	public abstract void moveRight();
	public abstract boolean jumpToCat();
	public abstract void jumpToDog();
	
	@Override
	public void setColor(int rgbColor){
		color = rgbColor;
	}
	@Override
	public void setSize(int s) {
		size = s;
	}
	
}
