import java.awt.Graphics;
import java.util.ArrayList;
import java.util.ListIterator;

public class Obstaculos {
	private ArrayList<Obstaculo> obts;
	
	public Obstaculos(){
		obts=new ArrayList <Obstaculo>(10);
	}
	
	public void agregar(Obstaculo obt){
		obts.add(obt);
	}
	public void paint(Graphics g){
		ListIterator<Obstaculo> apt=obts.listIterator();
		while(apt.hasNext()){
			Obstaculo p=apt.next();
			p.paint(g);
		}
	}
	public void avanza(){
		ListIterator <Obstaculo> apt=obts.listIterator();
		while(apt.hasNext()){
			Obstaculo aux=apt.next();
			aux.avanza();
		}
	}
	public int tam(){
		return obts.size();
	}
	
	/**
	public boolean colision(){
	ListIterator <Obstaculo> apt=obts.listIterator();
	boolean a=false;
	while(apt.hasNext()){
		Obstaculo aux=apt.next();
		/*if(aux.getX()>0 && (( 
				(aux.getX()+aux.getTamX()<=mon.getX()) ||
				(aux.getX()<= mon.getX()+mon.getTamanio()-6)) && 
				((aux.getY()+aux.getTamY()<=mon.getY()) || 
				(aux.getY()<=mon.getY()+mon.getTamanio())))){
			a=true;
			//mon.getX()+mon.getTamanio()==aux.getX()+aux.getTamX() && mon.getY()+mon.getTamanio()==aux.getY()+aux.getTamY()
		}
		*/
		/**
		if(aux.getX()>(mon.getX()-mon.getTamanio()) && aux.getX()<(mon.getX()+mon.getTamanio()) && aux.getY()>(mon.getY()-aux.getTamY()) && aux.getY()<(aux.getY()+aux.getTamY())){
			if(mon.getY()>=330){
				a=true;
			}
			
			//mon.getX()+mon.getTamanio()==aux.getX()+aux.getTamX() && mon.getY()+mon.getTamanio()==aux.getY()+aux.getTamY()
		}
		int XM=0, YM=0, XO=0, YO=0, T=0, g=0, h=0;
		XM=mon.getX();
		YM=mon.getY();
		XO=aux.getX();
		YO=aux.getY();
		T=mon.getTamanio();
		g=XO+aux.getTamX();
		h=YO+aux.getTamY();
		if((XO>0 && (XO<=XM+T)) && ((YO>0) && (YO<=YM))){
			System.out.println("XM:"+XM);
			System.out.println("XM+T: "+(XM+T));
			System.out.println("YM:"+YM);
			System.out.println("YM+T: "+(YM+T));
			System.out.println("XO:"+XO);
			System.out.println("XO+T: "+g);
			System.out.println("YO:"+YO);
			System.out.println("YO+T: "+h);
			
			a= true;
		}
	}
		
	return a;
	} 
	 **/
	
}
