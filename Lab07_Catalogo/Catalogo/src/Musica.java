
public class Musica extends Articulo{
	//VARIABLES DE INSTANCIA:
	private String interprete;
	private String formato;
	//CONSTRUCTORES:
	public Musica(){
		super();
		interprete  = "Elmer Homero";
		formato		= "MP3";
	}
	public Musica(String c, String t, int a, boolean d, String i, String f){
		super(c, t, a, d);
		interprete  = i;
		formato		= f;
	}
	//SETTERS:
	public void setInterprete(String i){
		interprete = i;
	}
	public void setFormato(String f){
		formato = f;
	}
	//GETTERS:
	public String getInterprete(){
		return interprete;
	}
	public String getFormato(){
		return formato;
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
		Musica AUX = (Musica)obj;
		return ((this.getTitulo().equals(AUX.getTitulo()))&&(this.interprete.equals(AUX.interprete)));
	}

	//toString:
	public String toString(){
		return super.toString()+" Interprete: "+interprete+". Formato: "+formato;
	}

}
