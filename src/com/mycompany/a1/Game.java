/**
 * 	Game.java class
 * 
 * 	Manages the flow of control. 
 * 
 * 	Primary class: "Model"
 * 		- Contains GameWorld and other state variables.
 * 		- Contains set of methods to accept and execute user commands.
 * 
 * 	Notes: 
 * 		Status: Working. 
 */
package com.mycompany.a1;

import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;

public class Game extends Form {
	
	private GameWorld gw; 
	
	public Game(){
		gw = new GameWorld();
		gw.InitLayout();
		play();
	}
	
	private void play(){
		//Code below taken from Appendix - CN1 notes.
		Label  myLabel = new Label("Enter a command: ");
		this.add(myLabel);
		final TextField myTextField = new TextField();
		this.add(myTextField);
		this.show();
		
		myTextField.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
				String sCommand = myTextField.getText().toString();
				myTextField.clear();
				switch(sCommand.charAt(0)) {
				case 'e':
					System.out.println("=== 'e' command entered: ===");
					gw.expand();
					break;
				case 'c':
					System.out.println("=== 'c' command entered: ===");
					gw.contract();
					break;
				case 's':
					System.out.println("=== 's' command entered: ===");
					gw.scoop();
					break;
				case 'r':
					System.out.println("=== 'r' command entered: ===");
					gw.moveRight();
					break;
				case 'l':
					System.out.println("=== 'l' command entered: ===");
					gw.moveLeft();
					break;
				case 'u':
					System.out.println("=== 'u' command entered: ===");
					gw.moveUp();
					break;
				case 'd':
					System.out.println("=== 'd' command entered: ===");
					gw.moveDown();
					break;
				case 'o':
					System.out.println("=== 'o' command entered: ===");
					gw.jumpToDog();
					break;
				case 'a':
					System.out.println("=== 'a' command entered: ===");
					gw.jumpToCat();
					break;
				case 'k':
					System.out.println("=== 'k' command entered: ===");
					gw.collision();
					break;
				case 'f':
					System.out.println("=== 'f' command entered: ===");
					gw.pretend();
					break;
				case 't':
					System.out.println("=== 't' command entered: ===");
					gw.tick();
					break;
				case 'p':
					System.out.println("=== 'p' command entered: ===");
					gw.printPoints();
					break;
				case 'm':
					System.out.println("=== 'm' command entered: ===");
					gw.printMap();
					break;
				case 'q':
					//quit
					System.out.println("Exiting the program.");
					System.exit(0);
					break;
				default:
					System.out.println("Error. Invalid command.");
					break;
				} //switch
			} //actionPerformed
		} //new ActionListener() 
		);
	}
}
