
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.ListIterator;

public class Plataformas{
	
	private ArrayList <Plataforma> pla;
	
	public Plataformas(){
		pla= new ArrayList <Plataforma>(10);
	}
	
	public void agregar(Plataforma plata){
		pla.add(plata);
	}
	public void paint(Graphics g){
		ListIterator<Plataforma> apt=pla.listIterator();
		while(apt.hasNext()){
			Plataforma p=apt.next();
			p.paint(g);
		}
	}
	public void avanza(){
		ListIterator <Plataforma> apt=pla.listIterator();
		while(apt.hasNext()){
			Plataforma aux=apt.next();
			aux.avanza();
		}
	}
	public int size(){
		pla.size();
		return pla.size();
	}
}
