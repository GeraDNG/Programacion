import java.util.Scanner;

public class Residuo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, y;
		System.out.println("Dame el valor entero del dividendo:");
		x = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Dame el valor entero del divisor:");
		y = teclado.nextInt();
		teclado.nextLine();
		while (x>=y){
			x = x - y;
		}
		System.out.println("El resultado es " + x);
		teclado.close();

	}

}
