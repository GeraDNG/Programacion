
public class Pickup extends Vehiculo{
	private double ancho, largo, alto, cargaMax;
	//Constructores:
	public Pickup(){
		super();
		ancho = 0;
		largo = 0;
		alto = 0;
		cargaMax = 1500000;
	}
	public Pickup(String m, String f,int c, double r, double p,double a, double l, double h, double max){
		super(m, f, c, r, p);
		ancho = a;
		largo = l;
		alto = h;
		cargaMax = max;
	}
	//Setters y Getters:
	public void setAncho(double a){
		ancho=a;
	}
	public double getAncho(){
		return ancho;
	}
	public void setLargo(double l){
		largo=l;
	}
	public double getLargo(){
		return largo;
	}
	public void setAlto(double h){
		alto=h;
	}
	public double getAlto(){
		return alto;
	}
	public void setCargaMax(double max){
		cargaMax = max;
	}
	public double getCargaMax(){
		return cargaMax;
	}
	//Metodos:
	public double rendimientoTotal(double peso){
		double aux=0;
		if(peso > cargaMax){
			aux = capacidad*rendimiento*.7;
		}
		else{
			aux = capacidad*rendimiento;
		}
		return aux;
	}
	public double Volumen(){
		return largo*ancho*alto;
	}
	//toString:
	public String toString(){
		return "Modelo: "+modelo+" Fabricante: "+fabricante+" Capacidad: "+capacidad+" Rendimiento: "+rendimiento+" Precio: "+precio+" Alto: "+alto+" Ancho: "+ancho+" Largo: "+largo+" Volumen: "+largo*ancho*alto;
	}

}