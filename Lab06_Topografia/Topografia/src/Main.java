import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Terreno miTerreno = new Terreno();
		int O, X, Y;
		do{
			System.out.println("Opciones:");
			System.out.println("1) Dar vertices.");
			System.out.println("2) Mostrar vertices en X.");
			System.out.println("3) Mostrar area.");
			System.out.println("4) Salir.");
			System.out.println("Dar el numero de la opcion deseada:   ");
			O = teclado.nextInt();
			switch (O){
			case 1:
				System.out.println("");
				System.out.println("A continuacion dar los vertices para X: ");
				for (int i=0; i<6; i++){
					System.out.println("Para el vertice "+i+": ");
					X = teclado.nextInt();
					miTerreno.setX(X, i);
				}
				System.out.println("A continuacion dar los vertices para Y: ");
				for (int i=0; i<6; i++){
					System.out.println("Para el vertice "+i+": ");
					Y = teclado.nextInt();
					miTerreno.setY(Y, i);
				}
				System.out.println("");
				break;
			case 2:
				System.out.println("");
				miTerreno.mostrarVertices();
				System.out.println("");
				break;
			case 3:
				System.out.println("");
				miTerreno.area();
				System.out.println("");
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			}
		} while (O!=4);
		teclado.close();
	}

}
