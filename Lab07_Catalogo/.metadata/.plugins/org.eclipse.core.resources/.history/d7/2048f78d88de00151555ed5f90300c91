
public class Catalogo {
	//VARIABLES DE INSTANCIA:
	private int indice;
	private Articulo arts[];
	//CONSTRUCTORES:
	public Catalogo(){
		indice  = 0;
		arts 	= new Articulo[50];
		for(int i=0; i<50; i++){
			arts[i]=null;
		}
	}
	public Catalogo(int i, Articulo arts[]){
		indice = i;
		arts = new Articulo[50];
		for(int j=0; j<50; j++){
			this.arts[j]=arts[j];
		}
	}
	//METODOS:
	//Agregar ejemplar al catalogo
	public void agregar (Articulo art){
		if(indice <0){
			arts[indice]=art;
			indice++;
		}
		else
			System.out.println("Ya esta lleno");
	}
	//Quitar ejemplar y recorrer en el arreglo
	public void quitar(String cod){
		int i=0, j=0;
		boolean enc=false;
		while((!enc)&&(i<50)){
			if (arts[i].getCodigo().equals(cod)){
				enc=true;
				j=i;
			}
			i++;
		}
		for(i=j; i<49; i--){
			arts[i]=arts[i+1];
		}
		arts[indice-1]=null;
		indice--;
	}
	//Ver todos los ejemplares de un mismo autor
	public void buscarAutor(String aut){
		for(int i=0; i<indice; i++){
			if(arts[i]instanceof Libro){
				Libro aux = (Libro)arts[i];
				if(aux.getAutor().equals(aut)){
					System.out.println(aux.toString());
				}
			}
		}
	}
	//buscar cancion en catalogo y regresar su codigo
	public void buscarCancion(String ca){
		for(int i=0; i<indice; i++){
			if(arts[i]instanceof Musica){
				Musica aux = (Musica)arts[i];
				if(aux.getTitulo().equals(ca)){
					System.out.println(aux.toString());
				}
				else{
					System.out.println("No existe");
				}
			}
		}
	}
	//Mostrar todos los libros del catalogo
	public void mostrarLibro(){
		for(int i=0; i<indice; i++){
			if(arts[i]instanceof Libro){
				Libro aux = (Libro)arts[i];
				System.out.println(aux.toString());
			}
		}
	}
	//Mostras todas las canciones del catalogo
	public void mostrarMusica(){
		for(int i=0; i<indice; i++){
			if(arts[i]instanceof Musica){
				Musica aux = (Musica)arts[i];
				System.out.println(aux.toString());
			}
		}
	}
}
