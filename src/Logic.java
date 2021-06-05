import java.util.ArrayList;
import java.util.Collections;
import processing.core.PApplet;

public class Logic {
	Marco m1;
	ArrayList<Polo> polos;
	Distance d;
	public int time=0;
	
	public Logic() {
		m1 = new Marco();
		polos = new ArrayList<Polo>();
		for(int i=0;i<19;i++) {
		Polo newPolo = new Polo();
		polos.add(newPolo);
	
		}
		d = new Distance();}
	
	public void draw(PApplet app) {
		
		if(app.frameCount%30==0) {time++;}
		
		new Thread(m1).start();

		for(int i=0; i<polos.size();i++) {
			new Thread(polos.get(i)).start();
			polos.get(i).drawPolo(app, m1.getPosX(), m1.getPosY());
			if(polos.get(i).getDist()<95) {
				Polo actual = polos.get(i);
				polos.remove(actual);
			}
		}
		Collections.sort(polos, d);
		m1.drawMarco(app);
		
		//pregunta
		if(time%3==0) {
		m1.chase( polos.get(0).getPosX(),polos.get(0).getPosY());}
	}

}
