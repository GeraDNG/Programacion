
import java.util.Scanner;
public class Multiplicacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, y, i=0, res=0;
		System.out.println("Dame el primer valor entero:");
		x = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Dame el segundo valor entero:");
		y = teclado.nextInt();
		teclado.nextLine();
		while (i<y){
			res = res + x;
			i++;
		}
		System.out.println("El resultado es " + res);

	}

}
