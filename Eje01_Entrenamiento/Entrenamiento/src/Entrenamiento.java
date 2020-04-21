public class Entrenamiento {
	//CONSTRUCTORES:
	private Fechas Fecha;
	private double max=0;
	private double min=0;
	private double p=0;
	private double[] tiempos;
	private int dia;
	private int mes;
	private int ano;
	private boolean bisiesto;

	public Entrenamiento (){
		Fecha = new Fechas ();
		for (int i=0; i<10; i++){
			tiempos[i]=0;
		}
	}
	public Entrenamiento (int d, int m, int a, double t[], boolean b){
		Fecha = new Fechas (d, m, a, bisiesto);
		for (int i=0; i<10; i++){
			tiempos [i] = t[i];
		}
		dia = d;
		mes = m;
		ano = a;
		bisiesto = b;
	}
	//SETTERS:
	public void setTiempos(double[] t){
		for (int i=0; i<10; i++){
			tiempos[i]=t[i];
		}
	}
	//GETTERS:
	public double[] getTiempos(){
		return tiempos;
	}
	//METODOS:
	public double promedio (double[] t){
		for (int i=0; i<10; i++){
			p= p + t[i];
		}
		p = p/10;
		return p;
	}
	public double maximo (double[] t){
		for (int i =0; i<10; i++){
			if (min != 0 && max != 0) {
                if (t[i] > max) {
                    max = t[i];
                }
            }
			else {
                max = t[i];
            }
			return max;

		}
	}
	public double minimo (double[] t){
		for (int i =0; i<10; i++){
			if (t[i] < min) {
                min = t[i];
            }
			else {
				min = t[i];
			}
		}
		return min;
	}

}
