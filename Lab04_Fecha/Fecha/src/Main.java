import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Fecha miFecha = new Fecha ();
		boolean b;
		int d, m, a, dC, mC, sumarDias, sumarMeses, sumarAnos, opcion;
		do{
			System.out.println();
			System.out.println("Opciones: ");
			System.out.println("1) Dar fecha actual.");
			System.out.println("2) Dar fecha cumpleanos.");
			System.out.println("3) Sumar anos a fecha actual.");
			System.out.println("4) Sumar meses a fecha actual.");
			System.out.println("5) Sumar dias a fecha actual.");
			System.out.println("6) Comparar fecha actual con su cumpleanos.");
			System.out.println("7) Salir.");
			System.out.println("Dar el numero de la opcion deseada:   ");
			System.out.println("(todo se debe de dar en numero, incluidos meses)");
			opcion = teclado.nextInt();
			switch (opcion){
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
				System.out.println("Dar el mes de su cumpleanos:   ");
				mC = teclado.nextInt();
				miFecha.setMesCumple(mC);
				System.out.println("Dar el dia de su cumpleanos:   ");
				dC = teclado.nextInt();
				miFecha.setDiaCumple(dC);
				break;
			case 3:
				System.out.println("Dar el numero de anos que desea sumar a la fecha actual:   ");
				sumarAnos = teclado.nextInt();
				a = miFecha.getAno();
				miFecha.sumarAnos(sumarAnos, a);
				d = miFecha.getDia();
				m = miFecha.getMes();
				a = miFecha.getAno();
				System.out.println("Es el dia "+d+" del mes "+m+" del ano "+a);
				break;
			case 4:
				System.out.println("Dar el numero de meses que desea sumar a la fecha actual:   ");
				sumarMeses = teclado.nextInt();
				m = miFecha.getMes();
				a = miFecha.getAno();
				miFecha.sumarMeses(sumarMeses, m, a);
				d = miFecha.getDia();
				m = miFecha.getMes();
				a = miFecha.getAno();
				System.out.println("Es el dia "+d+" del mes "+m+" del ano "+a);				break;
			case 5:
				System.out.println("Dar el numero de dias que desea sumar a la fecha actual:   ");
				sumarDias = teclado.nextInt();
				a = miFecha.getAno();
				m = miFecha.getMes();
				d = miFecha.getDia();
				b = miFecha.getBisiesto();
				miFecha.sumarDias(sumarDias, a, m, d, b);
				d = miFecha.getDia();
				m = miFecha.getMes();
				a = miFecha.getAno();
				System.out.println("Es el dia "+d+" del mes "+m+" del ano "+a);
				break;
			case 6:
				dC = miFecha.getDiaCumple();
				mC = miFecha.getMesCumple();
				d  = miFecha.getDia();
				m  = miFecha.getMes();
				if ((dC == d) && (mC == m)){
					System.out.println("Feliz cumpleanos");
				}
				else
					System.out.println("Aun no es su cumpleanos");
				break;
			case 7:
				System.out.println("Saliendo...");
				break;
			}
		} while (opcion != 7);
		
		teclado.close();
	}
}
