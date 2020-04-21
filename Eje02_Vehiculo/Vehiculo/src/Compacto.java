
public class Compacto extends Vehiculo{
	private boolean tipoCombustible; //0=combustible 1=electrico
	//Constructores
	public Compacto(){
		super();
		tipoCombustible = false;
	}
	public Compacto(String m, String f, int c, double r, double p, boolean t){
		super(m, f, c, r, p);
		tipoCombustible = t;
	}
	//Setters
	public void setTipoCombustible(boolean t){
		tipoCombustible = t;
	}
	//Getters
	public boolean getTipoCombustible(){
		return tipoCombustible;
	}
	//Metodos
	public double rendimientoTotal(){
		double aux=0;
		if(tipoCombustible){
			aux = capacidad*rendimiento;
		}
		else
		{
			aux = (capacidad*rendimiento)/100;
		}
		return aux;
	}
	//toString
	public String toString(){
		String AUX;
		if(tipoCombustible){
			AUX = "Gasolina";
		}
		else
		{
			AUX = "Electrico";
		}
		return "Modelo: "+modelo+" Fabricante: "+fabricante+" Capacidad: "+capacidad+" Rendimiento: "+rendimiento+" Precio: "+precio+" Tipo de combustible: "+AUX;
	}
	
}
