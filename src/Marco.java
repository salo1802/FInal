import processing.core.PApplet;

public class Marco {

	public int posX = 500;
	public int posY = 350;
	private boolean right = true;
	private boolean up = true;
	
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
		
		//movimiento
		
		if(posY>45) {if(up==true) {posY-=2;}}
		if(posY<655) {if(up==false) {posY+=2;}}
		if(posX<955) {if(right==true) {posX+=2;}}
		if(posX>45) {if(right==false) {posX-=2;}}
	}
	
	
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
}
