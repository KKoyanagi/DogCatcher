/**
 * GameWorld.java
 */
package com.mycompany.a1;

import java.util.ArrayList;

public class GameWorld {
	private int dogsCaptured, catsCaptured, dogsRemaining, catsRemaining, totalScore;
	private ArrayList<GameObject> gameObjects;
	
	public GameWorld() {
	}
	
	public void InitLayout() {
		//Make sure nothing is in the ArrayList and variables
		gameObjects.clear();
		dogsCaptured = catsCaptured = dogsRemaining = catsRemaining = totalScore = 0;
		
		//Starts with 3 dogs, 2 cats and 1 net.
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		addDog(d1); 
		addDog(d2);
		addDog(d3);
		
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		addCat(c1);
		addCat(c2);
		
		Net net = new Net(); //Initialized with size 100, color black, random location
		gameObjects.add(net);

		
	}
	
	private void addDog(GameObject go){
		dogsRemaining++;
		gameObjects.add(go);
	}
	
	private void addCat(GameObject go){
		catsRemaining++;
		gameObjects.add(go);
	}
	
	public void addCat(){
		catsRemaining++;
		gameObjects.add(new Cat());
	}
	
	
}
