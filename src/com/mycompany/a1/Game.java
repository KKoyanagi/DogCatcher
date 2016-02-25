/**
 * Game.java class
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
					gw.expand();
					break;
				case 'c':
					gw.contract();
					break;
				case 's':
					gw.scoop();
					break;
				case 'r':
					gw.moveRight();
					break;
				case 'l':
					gw.moveLeft();
					break;
				case 'u':
					gw.moveUp();
					break;
				case 'd':
					gw.moveDown();
					break;
				case 'o':
					gw.jumpToDog();
					break;
				case 'a':
					gw.jumpToCat();
					break;
				case 'k':
					gw.collision();
					break;
				case 'f':
					gw.pretend();
					break;
				case 't':
					gw.tick();
					break;
				case 'p':
					gw.printPoints();
					break;
				case 'm':
					gw.printMap();
					break;
				case 'q':
					//quit
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
