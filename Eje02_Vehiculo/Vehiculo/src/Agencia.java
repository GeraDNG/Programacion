import java.util.ArrayList;
import java.util.ListIterator;

public class Agencia {

	private ArrayList<Vehiculo> vehiculos;

	public Agencia(){
		vehiculos = new ArrayList<Vehiculo>(10);
	}

	public void agregar(Vehiculo obj){
		vehiculos.add(obj);
	}
	public void borrar(int obj){
		vehiculos.remove(obj);
	}
	public boolean existencia(String obj){
		return vehiculos.contains(obj);
	}
	public void carrosAdquiribles(double presupuesto){
		//Podemos agregar un contador
		int c=0;
		ListIterator<Vehiculo> apt= vehiculos.listIterator();
		while(apt.hasNext()){
			Vehiculo aut= apt.next();
			if(aut.getPrecio()<=presupuesto){
				c++;
				if(aut instanceof Compacto){
					Compacto auxC=(Compacto)aut;
					auxC.toString();
				}
				if(aut instanceof Familiar){
					Familiar auxC=(Familiar)aut;
					auxC.toString();
				}
				if(aut instanceof Pickup){
					Pickup auxC=(Pickup)aut;
					auxC.toString();
				}
			}
		}
		if(c==0){
			System.out.println("No existen autos dentro de tu presupuesto");
		}
	}
	
	public void mejorRendimiento(){
		int ind=0;
		double max;
		max=vehiculos.get(0).getRendimiento();
		System.out.println("El auto con mejor rendimiento es: ");
		ListIterator<Vehiculo> apt= vehiculos.listIterator();
		while(apt.hasNext()){
			int i=0;
			Vehiculo aut= apt.next();
			if(aut.getRendimiento()>max){
				max=aut.getRendimiento();
				ind=i;
			}
			i++;
		}
		Vehiculo aut= vehiculos.get(ind);
		if(aut instanceof Compacto){
			Compacto auxC=(Compacto)aut;
			auxC.toString();
		}
		if(aut instanceof Familiar){
			Familiar auxC=(Familiar)aut;
			auxC.toString();
		}
		if(aut instanceof Pickup){
			Pickup auxC=(Pickup)aut;
			auxC.toString();
		}
	}
	
	public String toString(){
		String a="";
		ListIterator<Vehiculo> apt= vehiculos.listIterator();
		while(apt.hasNext()){
			Vehiculo aut=apt.next();
			if(aut instanceof Compacto){
				Compacto auxC=(Compacto)aut;
				a="\n"+a+auxC.toString();
			}
			if(aut instanceof Familiar){
				Familiar auxC=(Familiar)aut;
				a="\n"+a+auxC.toString();
			}
			if(aut instanceof Pickup){
				Pickup auxC=(Pickup)aut;
				a="\n"+a+auxC.toString();
			}
		}
		return a;
	}
	public String muestraPickup(){
		String a="";
		ListIterator<Vehiculo> apt= vehiculos.listIterator();
		while(apt.hasNext()){
			Vehiculo aut=apt.next();
			if(aut instanceof Pickup){
				Pickup auxC=(Pickup)aut;
				a="\n"+a+auxC.toString();
			}
		}
		return a;
	}
}