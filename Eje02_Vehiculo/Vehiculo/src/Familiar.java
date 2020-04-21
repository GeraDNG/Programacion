
public class Familiar extends Vehiculo {
	private boolean dvd;
	//Constructores:
	public Familiar(){
		super();
		dvd=false;	
	}
	public Familiar(String m, String f,int c, double r, double p, boolean d){
		super(m, f, c, r, p);
		dvd=d;
	}
	//Setter:
	public void setDvd(boolean d){
		dvd=d;
	}
	//Getters:
	public boolean getDvd(){
		return dvd;
	}
	//toString:
	public String toString(){
		String aux;
		if(dvd){
			aux = "Si";
		}
		else
		{
			aux = "No";
		}
		return "Modelo: "+modelo+" Fabricante: "+fabricante+" Capacidad: "+capacidad+" Rendimiento: "+rendimiento+" Precio: "+precio+ " DVD: "+aux;
	}
}