
public class Libro extends Articulo{
	//VARIABLES DE INSTANCIA:
	private String 	autor;
	private int		noPaginas;
	//CONSTRUCTORES:
	public Libro(){
		super();
		autor="Elmer Homero";
		noPaginas = 0;
	}
	public Libro(String c, String t, int a, boolean d, String aut, int n){
		super(c, t, a, d);
		autor 		= aut;
		noPaginas 	= n;
	}
	//EQUALS:
	public boolean equals(Object obj){
		//Reflexividad:
		if (this==obj){
			return true;
		}
		//Null
		if(obj==null){
			return false;
		}
		//Misma clase
		if(this.getClass()!=obj.getClass()){
			return false;
		}
		//Checar las variables con Cast
		Libro AUX = (Libro)obj;
		return ((this.getTitulo().equals(AUX.getTitulo()))&&(this.autor.equals(AUX.autor)));
	}
	//SETTERS:
	public void setAutor(String aut){
		autor = aut;
	}
	public void setNoPaginas(int n){
		noPaginas = n;
	}
	//GETTERS:
	public String getAutor(){
		return autor;
	}
	public int getNoPaginas(){
		return noPaginas;
	}
	//toString:
	public String toString(){
		return super.toString()+" autor "+autor+" paginas "+noPaginas;
	}
	
}
