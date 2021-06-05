import java.util.ArrayList;
import java.util.Collections;
import processing.core.PApplet;

public class Logic {
	Marco m1;
	ArrayList<Polo> polos;
	Distance d;
	
	public Logic() {
		m1 = new Marco();
		polos = new ArrayList<Polo>();
		for(int i=0;i<19;i++) {
		Polo newPolo = new Polo();
		polos.add(newPolo);
	
		}
		d = new Distance();}
	
	
	public void draw(PApplet app) {
		
		
		
	

		for(int i=0; i<polos.size();i++) {
			polos.get(i).start();
			polos.get(i).drawPolo(app, m1.getPosX(), m1.getPosY());
		}
		
		m1.drawMarco(app, polos.get(0).getPosX(),polos.get(0).getPosY());
		
		
		Collections.sort(polos, d);
	}

}
