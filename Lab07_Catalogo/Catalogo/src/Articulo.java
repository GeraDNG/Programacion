public class Articulo {
	//VARIABLES:
	private String 	codigo;
	private String 	titulo;
	private int		anio;
	private boolean	disponible;
	//CONSTRUCTORES:
	public Articulo (String c, String t, int a, boolean d){
		codigo 		= c;
		titulo 		= t;
		anio		= a;
		disponible 	= d;
	}
	public Articulo (){
		codigo 		= "Elmer";
		titulo 		= "Homero";
		anio		= 0;
		disponible 	= false;
	}
	//GETTERS:
	public String getCodigo(){
		return codigo;
	}
	public String getTitulo(){
		return titulo;
	}
	public int getAnio(){
		return anio;
	}
	public boolean isDisponible(){
		return disponible;
	}
	//SETTERS:
	public void setDisponible(boolean d){
		disponible = d;
	}
	//Equals:
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
		Articulo aux = (Articulo)obj;
		return (this.titulo.equals(aux.titulo));
	}
	//toString:
	public String toString(){
		if (disponible){
			return "codigo "+codigo+" titulo "+titulo+" anio "+anio+" disponible";
		}
		else
			return "codigo "+codigo+" titulo "+titulo+" anio "+anio+" no disponible";
	}
}
