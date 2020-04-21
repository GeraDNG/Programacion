import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner  teclado 	= new Scanner(System.in);
		Catalogo miCatalogo = new Catalogo();
		int o = 0, a = 0, tipo = 0, n = 0;
		boolean d;
		String cod, aut, ca, c, t, i, f;
		do{
			System.out.println();
			System.out.println("Menu de opciones: ");
			System.out.println("1) Agregar un ejemplar al catalogo.");
			System.out.println("2) Quitar un ejemplar del catalogo.");
			System.out.println("3) Ver todos los ejemplares escritos por un autor.");
			System.out.println("4) Ver si hay una cancion en el catalogo.");
			System.out.println("5) Mostrar todos los libros.");
			System.out.println("6) Mostrar todas las canciones.");
			System.out.println("7) Salir.");
			System.out.println("Dar el numero de la opcion deseada:   ");
			o = teclado.nextInt();
			switch(o){
			case 1:
				System.out.println();
				System.out.println("Escribir el codigo:   ");
				c = teclado.next();
				System.out.println("Escribir el titulo:   ");
				t = teclado.next();
				System.out.println("Escribir el año:   ");
				a = teclado.nextInt();
				System.out.println("Esta disponible? (1=si, 0=no):   ");
				d = teclado.nextBoolean();
				System.out.println("Es un libro o musica? (1=libro, 0=musica):   ");
				tipo = teclado.nextInt();
				if(tipo==1){
					teclado.nextLine();
					System.out.println("Dame el autor:   ");
					aut = teclado.nextLine();
					System.out.println("Dame el numero de paginas:   ");
					n = teclado.nextInt();
					Articulo art = new Libro(c, t, a, d, aut, n);
					miCatalogo.agregar(art);
				}
				if(tipo==0){
					teclado.nextLine();
					System.out.println("Dame el interprete:   ");
					i = teclado.nextLine();
					System.out.println("Dame el formato:   ");
					f = teclado.nextLine();
					Articulo art = new Musica(c, t, a, d, i, f);
					miCatalogo.agregar(art);
				}
				break;
			case 2:
				System.out.println();
				System.out.println("Escribir el nombre deseado a eliminar:   ");
				cod = teclado.next();
				miCatalogo.quitar(cod);
				System.out.println("De acuerdo.");
				break;
			case 3:
				System.out.println();
				System.out.println("Escribir el autor deseado a buscar:   ");
				aut = teclado.next();
				miCatalogo.buscarAutor(aut);
				break;
			case 4:
				System.out.println();
				System.out.println("Escribir el nombre de la cancion:   ");
				ca = teclado.next();
				miCatalogo.buscarCancion(ca);
				break;
			case 5:
				miCatalogo.mostrarLibro();
				break;
			case 6:
				miCatalogo.mostrarMusica();
				break;
			case 7:
				System.out.println();
				System.out.println("Saliendo... ");
				break;
			}
		} while (o != 7);
		teclado.close();
	}

}
