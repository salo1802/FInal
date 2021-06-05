import processing.core.PApplet;

public class Polo extends Thread{
public int posX;
public int posY;
public float dist;
private boolean right;
private boolean up;
private int mPosX;
private int mPosY;

public Polo() {
	
	right = true;
	up = false;
	posX = (int)(Math.random()*(950-50)+50);
	posY = (int)(Math.random()*(650-50)+50);
	dist = PApplet.dist(posX, posY, mPosX, mPosY);
	
}
	
@Override
public void run() {
	
	move();
}

public void drawPolo(PApplet app,int cX,int cY) {
	
	dist = PApplet.dist(posX, posY, mPosX, mPosY);
	//poscicionde marco
	mPosX = cX;
	mPosY = cY;
	//pintada
	app.fill(0,100,0);
	app.circle(posX, posY, 100);
	app.fill(0);
	app.text("Polo", posX, posY+10);
	
}

public void move() {
	//movimiento
	
		if(posY<50) {up=false;}
		if(posY>650) {up=true;}
		if(posY<50) {right=true;}
		if(posX>950) {right=false;}
	
		if(posY>50) {if(up==true) {posY--;}}
		if(posY<650) {if(up==false) {posY++;}}
		if(posX<950) {if(right==true) {posX++;}}
		if(posX>50) {if(right==false) {posX--;}}
		
		//escape
		
		if((mPosX-posX)>=0) {right=false;}
		if((mPosX-posX)<0) {right=true;}
		if((mPosY-posY)>=0) {up=true;}
		if((mPosY-posY)<0) {up=false;}
}
	

 public float getDist() {
	return dist;
}
 
 public int getPosX() {
	return posX;
}
 
 public int getPosY() {
	return posY;
}
}
