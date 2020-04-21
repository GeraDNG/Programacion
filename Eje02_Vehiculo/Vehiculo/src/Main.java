import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Agencia miAgencia = new Agencia();
		Vehiculo miVehiculo = new Vehiculo();
		Compacto compacto1= new Compacto(); 
		Compacto compacto2= new Compacto(); 
		Compacto compacto3= new Compacto(); 
		Familiar familiar1= new Familiar();
		Pickup pickup1= new Pickup();
		Pickup pickup2= new Pickup();
		miAgencia.agregar(compacto1);
		miAgencia.agregar(compacto2);
		miAgencia.agregar(compacto3);
		miAgencia.agregar(familiar1);
		miAgencia.agregar(pickup1);
		miAgencia.agregar(pickup2);
		int o;
		do{
			System.out.println();
			System.out.println("Opciones:");
			System.out.println("1) Agregar vehiculo");
			System.out.println("2) Borrar vehiculo familiar.");
			System.out.println("3) Ver existencia de vehiculo.");
			System.out.println("4) Ver vehiculos adquiribles.");
			System.out.println("5) Ver vehiculo con mejor rendimiento.");
			System.out.println("6) Mostrar pickups.");
			System.out.println("7) Salir.");
			System.out.println(" Dar el numero de la opcion deseada:   ");
			o = teclado.nextInt();
			switch (o){
			case 1:
				System.out.println("Dar modelo.");
				String m = teclado.next();
				miVehiculo.setModelo(m);
				System.out.println("Dar fabricante.");
				String f = teclado.next();
				miVehiculo.setFabricante(f);
				System.out.println("Dar capacidad.");
				int c = teclado.nextInt();
				miVehiculo.setCapacidad(c);
				System.out.println("Dar rendimiento.");
				double r = teclado.nextDouble();
				miVehiculo.setRendimiento(r);
				System.out.println("Dar precio.");
				double p = teclado.nextDouble();
				miVehiculo.setPrecio(p);
				System.out.println("¿Es compacto (0), familiar (1) o pickup (2)? (Dar el numero)"); 
				int tipo = teclado.nextInt();
				if(tipo==1){
					System.out.println("¿Es electrico? (1 para si o 0 para no): ");
					boolean t = teclado.nextBoolean();
					Vehiculo compacto = new Compacto(m, f, c, r, p, t);
					miAgencia.agregar(compacto);
				}
				if(tipo==2){
					System.out.println("¿Cuenta con DVD? (1 para si o 0 para no): ");
					boolean d = teclado.nextBoolean();
					Vehiculo familiar = new Familiar(m, f, c, r, p, d);
					miAgencia.agregar(familiar);
				}
				if(tipo==3){
					System.out.println("Dar el ancho: ");
					double a = teclado.nextDouble();
					System.out.println("Dar el largo: ");
					double l = teclado.nextDouble();
					System.out.println("Dar el alto: ");
					double h = teclado.nextDouble();
					System.out.println("Dar la carga maxima: ");
					double max = teclado.nextDouble();
					Vehiculo pickup = new Pickup(m, f, c, r, p, a, l, h, max);
					miAgencia.agregar(pickup);
				}
				else{
					System.out.println("Error.");
				}
				break;
			case 2:
				System.out.println("Dar el numero del carro que desea eliminar: ");
				int aux = teclado.nextInt();
				miAgencia.borrar(aux);
				break;
			case 3:
				System.out.println("¿Que tipo de vehiculo busca? (Compacto, Familiar o Pickup): ");
				String tipoVehiculo=teclado.next();
				miAgencia.existencia(tipoVehiculo);
				break;
			case 4:
				System.out.println("¿De cuanto es tu presupuesto?");
				double presupuesto = teclado.nextDouble();
				miAgencia.carrosAdquiribles(presupuesto);
				break;
			case 5:
				miAgencia.mejorRendimiento();
				break;
			case 6:
				miAgencia.muestraPickup();
				break;
			case 7:
				System.out.println("Saliendo...");
			}
		} while (o!=7);
		teclado.close();
	}
}