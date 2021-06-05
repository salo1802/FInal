import java.util.ArrayList;
import java.util.Collections;
import processing.core.PApplet;

public class Logic {
	ArrayList<Polo> polos;
	ArrayList<Marco> marcos;
	Distance d;
	public int time=0;
	
	public Logic() {
		polos = new ArrayList<Polo>();
		marcos = new ArrayList<Marco>();
		for(int i=0;i<19;i++) {
		Polo newPolo = new Polo();
		polos.add(newPolo);}
		Marco marco1 = new Marco();
		marcos.add(marco1);
		d = new Distance();}
	
	public void draw(PApplet app) {
		
		if(app.frameCount%30==0) {time++;}
		
		for(int i=0; i<marcos.size();i++) {
			marcos.get(i).drawMarco(app);
			new Thread(marcos.get(i)).start();
		}
		
		for(int i=0; i<polos.size();i++) {
			new Thread(polos.get(i)).start();
			for(int j=0;j<marcos.size();j++) {
			polos.get(i).drawPolo(app, marcos.get(j).getPosX(), marcos.get(j).getPosY());
			if(polos.get(i).getDist()<95) {
				Polo actual = polos.get(i);
				Marco newM = new Marco();
				newM.setPosX(polos.get(i).getPosX());
				newM.setPosY(polos.get(i).getPosY());
				marcos.add(newM);
				polos.remove(actual);}
			//pregunta
			//if(time%2==0) {	
			marcos.get(j).chase( polos.get(0).getPosX(),polos.get(0).getPosY());}
			//time=0;}
			}
		
		if(time%3==0) {	Collections.sort(polos, d);}
		
	}

}
