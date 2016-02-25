/**
 * GameWorld.java
 * 
 * Notes:
 * 	I don't actually have to have the net be in the ArrayList of GameObjects since there will
 * 		only ever be one net. 
 */
package com.mycompany.a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GameWorld {
	private int dogsCaptured, catsCaptured, dogsRemaining, catsRemaining, totalScore;
	private ArrayList<GameObject> gameObjects;
	private Random rand = new Random();
	private Net net;
	
	public GameWorld() {
	}
	
	public void InitLayout() {
		//Make sure nothing is in the ArrayList and variables
		gameObjects.clear();
		dogsCaptured = catsCaptured = dogsRemaining = catsRemaining = totalScore = 0;
		
		//Starts with 3 dogs, 2 cats and 1 net.
		addDog(new Dog());
		addDog(new Dog());
		addDog(new Dog());
		
		addCat(new Cat());
		addCat(new Cat());
		
		//Initialized with size 100, color black, random location
		net = new Net();
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
	
	//addCat() method for adding a kitten to the game
	public void addCat(){
		catsRemaining++;
		gameObjects.add(new Cat());
	}
	
	public void expand(){
		for(int i = 0; i < gameObjects.size(); i++) {
			if(gameObjects.get(i) instanceof Net) {
				((Net) gameObjects.get(i)).setSize(100);
			}
		}
	}
	
	public void contract(){
		for(int i = 0; i < gameObjects.size(); i++) {
			if(gameObjects.get(i) instanceof Net) {
				((Net) gameObjects.get(i)).setSize(50);
			}
		}
	}
	
	public void scoop(){
		//Rules: Catching an unscratched dog is worth 10 points
		//		 	one scratch deducts one point from 10
		//		 Catching a cat deducts 10 points.
		float[] netLoc = new float[2];
		int netSize = 0;
		for(int i = 0; i < gameObjects.size(); i++) {
			if(gameObjects.get(i) instanceof Net) {
				//Probably doesn't need to be casted to Net
				netLoc = gameObjects.get(i).getLocation(); 
				netSize = gameObjects.get(i).getSize();
			}
		}
		
		float[] animalLoc;
		for(int j = 0; j < gameObjects.size(); j++) {
			//Check the x field. 
			animalLoc = gameObjects.get(j).getLocation();
		
			if((animalLoc[0] <= (netLoc[0] + (netSize/2))) && (animalLoc[0] >= (netLoc[0] - (netSize/2)))){
				//Check y field.
				if((animalLoc[1] <= (netLoc[1] + (netSize/2))) && (animalLoc[1] >= (netLoc[1] - (netSize/2)))){
					if(gameObjects.get(j) instanceof Cat){
						//Subtract 10 points for catching a cat
						totalScore = totalScore - 10;
						//Do I remove the cat? - Assuming I do since the net is "catching" it
						gameObjects.remove(j);
						catsRemaining--;
					}
					else if(gameObjects.get(j) instanceof Dog){
						//Check for scratches 
						int scratches = ((Dog) gameObjects.get(j)).getScratches();
						totalScore = totalScore + (10 - scratches);
						//Minus one point per scratch.
						//Remove dog
						gameObjects.remove(j); 
						dogsRemaining--;
					}
				}
			}
		}
		
	}
	
	public void moveRight(){
		
	}
	
	public void moveLeft(){
		
	}
	
	public void moveUp(){
		
	}
	
	public void moveDown(){
		
	}
	
	public void jumpToDog(){
		
	}
	
	public void jumpToCat(){
		
	}
	
	public void collision(){
		//Collision is simulated. Two cats run into each other and a kitten is produced.
		//A new cat is created in a nearby location to one of its parents. 
		Cat kitten = new Cat();
		float[] catLoc = new float[2];
		
		for(int i = 0; i < gameObjects.size(); i++) {
			if(gameObjects.get(i) instanceof Cat) {
				 catLoc = gameObjects.get(i).getLocation();
			}
		}
		
		//Nearby location of a cat.
		kitten.setLocation(catLoc[0] + 5, catLoc[1] + 5);
		addCat(kitten);
	}
	
	public void pretend(){
		//Cat scratches the dog. Color of the dog changes. Reduces the dog speed by 1. 
		boolean found = false; 
		//Look for a random location from 0 to size-1
		int randomLoc = rand.nextInt(gameObjects.size()-1) + 0;
				
		while(!found) {
			if(gameObjects.get(randomLoc) instanceof Dog){
				((Dog) gameObjects.get(randomLoc)).addScratch();
				found = true;
			}
			else {
				randomLoc = rand.nextInt(gameObjects.size()-1) + 0;
			}
		}
	}
	
	public void tick(){
		for(int i = 0; i < gameObjects.size(); i++) {
			if(gameObjects.get(i) instanceof Animal) {
				((Animal) gameObjects.get(i)).move();
			}
		}
	}
	
	public void printPoints(){
		
	}
	
	public void printMap(){
		
	}
	
	
}
