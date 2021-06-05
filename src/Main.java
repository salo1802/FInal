

import processing.core.PApplet;

public class Main extends PApplet{
	
	public static void main(String[] args) {
		PApplet.main("Main");
		
	}
	
	@Override
	public void settings() {
		size(1000,700);
		 
		 
	}
	
	Polo p1;
	Marco m1;
	
	
	@Override
	public void setup() {
	
	m1 = new Marco();
	p1 = new Polo();
	textSize(40);
	textAlign(CENTER);
		  
	}
	
@Override
public void draw() {
	background(255);
	p1.drawPolo(this,m1.getPosX(),m1.getPosY());
	m1.drawMarco(this);
	  
     
     

     
    
	}

 }

