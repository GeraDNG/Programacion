import java.util.Scanner;
public class strComparacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String s1;
		String s2;
		System.out.println("Se compararan dos cadenas.");
		System.out.println("Escriba la primer cadena: ");
		s1 = teclado.next();
		teclado.nextLine();
		System.out.println("Escribe la segunda cadena: ");
		s2 = teclado.next();
		teclado.nextLine();
		teclado.close();
		if (s1.compareTo(s2)==0){
			System.out.println("El string "+s1+" es igual a "+s2);
		}
		if (s1.compareTo(s2)<0){
			System.out.println("El string "+s1+" es mayor a "+s2);
		}
		if (s1.compareTo(s2)>0){
			System.out.println("El string "+s1+" es menor a "+s2);
		}
		

	}

}
