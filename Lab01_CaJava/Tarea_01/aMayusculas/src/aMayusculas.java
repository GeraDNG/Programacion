import java.util.Scanner;
public class aMayusculas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String s1;
		System.out.println("Se convertira el texto a mayusculas.");
		System.out.println("Ingrese el texto: ");
		s1 = teclado.next();
		teclado.nextLine();
		s1=s1.toUpperCase();
		System.out.println(s1);
		teclado.close();

	}

}
