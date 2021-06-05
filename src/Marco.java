import java.util.Set;

import processing.core.PApplet;

public class Marco extends Thread{

	public int posX = 500;
	public int posY = 350;
	private boolean right = true;
	private boolean up = true;
	private int poloX;
	private int poloY;
	
	@Override
	public void run() {
		
		move();
	}
	
	public void drawMarco(PApplet app) {
		
		
		
		//draw
		app.stroke(200,0,0);
		app.strokeWeight(5);
		app.fill(255);
		app.circle(posX, posY, 90);
		app.stroke(0);
		app.strokeWeight(1);
		app.fill(0);
		app.textSize(30);
		app.text("M", posX,posY+10);
		app.textSize(40);
		
		
	
	
	}
	
	
	
	public void move() {
		//movimiento
		if(posY<45) {up=false;}
		if(posY>655) {up=true;}
		if(posX<45) {right=true;}
		if(posX>955) {right=false;}
				if(posY>45) {if(up==true) {posY-=2;}}
				if(posY<655) {if(up==false) {posY+=2;}}
				if(posX<955) {if(right==true) {posX+=2;}}
				if(posX>45) {if(right==false) {posX-=2;}}
				
			
	}
	
	public void chase(int pX,int pY) {
		//perseguir
		
		poloX = pX;
		poloY = pY;
				if(posX-poloX>5) {right=true;}
				if(posX-poloX<-5) {right=false;}
					if(posY-poloY>5) {up=true;}
					if(posY-poloY<5) {up=false;}
	}
	
	
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	public void setPosY(int posY) {
		this.posY = posY;
	}
}
