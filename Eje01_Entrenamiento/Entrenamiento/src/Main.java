import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Fechas miFecha = new Fechas ();
		Entrenamiento miEntrenamiento = new Entrenamiento();
		int d, m, a, o;
		boolean b;
		double max, min, p;
		double t [] = new double[10];
		do{
			System.out.println();
			System.out.println("Opciones: ");
			System.out.println("1) Dar fecha actual.");
			System.out.println("2) Dar tiempos.");
			System.out.println("3) Promedio.");
			System.out.println("4) Maximo.");
			System.out.println("5) Minimo.");
			System.out.println("6) Salir.");
			System.out.println("Dar el numero de la opcion deseada:   ");
			o = teclado.nextInt();
			switch (o){
			case 1:
				System.out.println("Dar el ano actual:   ");
				a = teclado.nextInt();
				miFecha.setAno(a);
				miFecha.setBisiesto(a);
				b=miFecha.getBisiesto();
				System.out.println("Dar el mes actual:   ");
				m = teclado.nextInt();
				miFecha.setMes(m);
				System.out.println("Dar el dia actual:   ");
				d = teclado.nextInt();
				miFecha.setDia(b, m, d);
				break;
			case 2:
				for (int i = 0; i<10; i++){
					System.out.println("Dar tiempo "+i);
					t[i]=teclado.nextDouble();
				}
				miEntrenamiento.setTiempos(t);
				break;
			case 3:
				p = miEntrenamiento.promedio(t);
				System.out.println("El promedio es de: "+p);
				break;
			case 4:
				max=miEntrenamiento.maximo(t);
				System.out.println("El maximo es: "+max);
				break;
			case 5:
				min=miEntrenamiento.minimo(t);
				System.out.println("El minimo es: "+min);
				break;
			case 6:
				System.out.println("Saliendo...");
				break;
			}
		} while (o!=6);
		teclado.close();

	}

}
