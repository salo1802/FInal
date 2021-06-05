

import processing.core.PApplet;

public class Main extends PApplet{
	
	public static void main(String[] args) {
		PApplet.main("Main");
		
	}
	
	@Override
	public void settings() {
		size(1000,700);
		 
		 
	}
	
	Logic logic;
	
	@Override
	public void setup() {
	
	logic = new Logic();
	frameRate=60;
	textSize(40);
	textAlign(CENTER);
		  
	}

@Override
public void draw() {
	background(255);
	logic.draw(this);
	
	  
     
     

     
    
	}

 }

