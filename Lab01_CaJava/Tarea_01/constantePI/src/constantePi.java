import java.util.Scanner;
public class constantePi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n, res=1, i=1;
		System.out.println("Se usara el algoritmo de Gottfried Willhem Von Leibniz para calcular pi.");
		System.out.println("Da un valor entero para el algoritmo: ");
		n = teclado.nextDouble();
		teclado.nextLine();
		teclado.close();
		while (i<=n){
			i=i+2;
			res=res+(-1/i);
			i=i+2;
			res=res+(1/i);
		}
		res=4*res;
		System.out.println("El resultado del algoritmo es: "+res);

	}

}
