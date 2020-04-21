import java.util.Scanner;
public class Potencia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int base, n, i=0, res=1;
		System.out.println("Dame el valor de la base: ");
		base = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Dame el valor de la potencia: ");
		n = teclado.nextInt();
		teclado.nextLine();
		teclado.close();
		while (i<n){
			res=res*base;
			i++;
		}
		System.out.println("Elevar " + base + " a la " + n + " nos da " + res);

	}

}
