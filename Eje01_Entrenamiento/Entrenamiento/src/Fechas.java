public class Fechas {
	private int dia;
	private int mes;
	private int ano;
	private boolean bisiesto;
	//CONSTRUCTORES:
	public Fechas (){
		dia 		= 31;
		mes 		= 1;
		ano			= 2016;
		bisiesto	= false;
	}
	public Fechas (int d, int m, int a, boolean b){
		dia 		= d;
		mes 		= m;
		ano 		= a;
		bisiesto	= b;
	}
	//SETTERS:
	public void setAno (int a){
		ano = a;
	}
	public void setBisiesto (int a){
		if ((a/4 == 0) && (a/100 != 0)){
			bisiesto = true;
		}
	}
	public void setMes (int m){
		if (m<12 && m>0){
			mes = m;
		}
	}
	public void setDia (boolean bisiesto, int m, int d){
		switch (m){
		case 1: 
			if (d<=31 && d>0){
				dia = d;
			} break;
		case 2:
			if (bisiesto==true){
				if (d<=29 && d>0){
					dia = d;
				}
			}
			if (bisiesto==false){
				if (d<=28 && d>0){
					dia = d;
				}
			} break;
		case 3:
			if (d<=31 && d>0){
				dia = d;
			} break;
		case 4:
			if (d<=30 && d>0){
				dia = d;
			} break;
		case 5:
			if (d<=31 && d>0){
				dia = d;
			} break;
		case 6: 
			if (d<=30 && d>0){
				dia = d;
			} break;
		case 7:
			if (d<=31 && d>0){
				dia = d;
			} break;
		case 8:
			if (d<=31 && d>0){
				dia = d;
			} break;
		case 9:
			if (d<=30 && d>0){
				dia = d;
			} break;
		case 10:
			if (d<=31 && d>0){
				dia = d;
			} break;
		case 11:
			if (d<=30 && d>0){
				dia = d;
			} break;
		case 12:
			if (d<=31 && d>0){
				dia = d;
			} break;
		}
	}
	//GETTERS:
	public int getDia (){
		return dia;
	}
	public int getMes (){
		return mes;
	}
	public int getAno (){
		return ano;
	}
	public boolean getBisiesto(){
		return bisiesto;
	}
	//METODOS:
}