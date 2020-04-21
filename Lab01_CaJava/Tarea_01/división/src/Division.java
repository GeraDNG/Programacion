
import java.util.Scanner;
public class Division {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, y, i=0;
		System.out.println("Dame el valor entero del dividendo:");
		x = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Dame el valor entero del divisor:");
		y = teclado.nextInt();
		teclado.nextLine();
		while (x>0){
			x = x - y;
			i++;
		}
		System.out.println("El resultado es " + i);
	}

}
