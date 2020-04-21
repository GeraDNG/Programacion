
public class Puntuacion {
	private int puntaje;
	
	public Puntuacion(){
		puntaje=0;
	}
	public Puntuacion(String n,int p){
		puntaje=p;
	}

	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	public void score(){
		puntaje=puntaje+1;
	}
}