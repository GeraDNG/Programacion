public class Fecha {
	private int dia;
	private int mes;
	private int ano;
	private int diaCumple;
	private int mesCumple;
	private int AUX;
	private boolean bisiesto;
	//CONSTRUCTORES:
	public Fecha (){
		dia 		= 31;
		mes 		= 1;
		ano			= 2016;
		diaCumple	= 5;
		mesCumple 	= 1;
		AUX			= 0;
	}
	public Fecha (int d, int m, int a, int dC, int mC, int AUX){
		dia 		= d;
		mes 		= m;
		ano 		= a;
		diaCumple 	= dC;
		mesCumple 	= mC;
		this.AUX	= AUX;
	}
	//SETTERS:
	public void setMesCumple (int mC){
		mesCumple = mC;
	}
	public void setDiaCumple (int dC){
		diaCumple = dC;
	}
	public void setAno (int a){
		ano = a;
	}
	public void setBisiesto (int a){
		if ((a/4 == 0) || (a/100 != 0)){
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
	public int getDiaCumple(){
		return diaCumple;
	}
	public int getMesCumple(){
		return mesCumple;
	}
	public boolean getBisiesto(){
		return bisiesto;
	}
	//METODOS:
	public void sumarAnos (int sumarAnos, int a){
		ano = a + sumarAnos;
	}
	public void sumarMeses (int sumarMeses, int m, int a){
		int AUX=0;
		for (int i=0; i<= sumarMeses; i++){
			mes = m + i;
			if (mes > 12){
				AUX = (sumarMeses - i);
				mes = 1 + AUX;
				ano = a + 1;
			}
		}
	}
	public void sumarDias (int sumarDias, int a, int m, int d, boolean bisiesto){
		for (int i=0; i<=sumarDias; i++)
			switch (m){
			case 1:
				dia = d + i;
				if (dia>=32){
					AUX = sumarDias - i;
					dia = 1 + AUX;
					mes = m + 1;
				} break;
			case 2:
				dia = d + i;
				if (bisiesto == true){
					if (dia>=30){
						AUX = sumarDias - i;
						dia = 1 + AUX;
						mes = m + 1;
					}
				}
				if (bisiesto == false){
					if (dia>=29){
						AUX = sumarDias - i;
						dia = 1 + AUX;
						mes = m + 1;
					}
				}
				break;
			case 3:
				dia = d + i;
				if (dia>=32){
					AUX = sumarDias - i;
					dia = 1 + AUX;
					mes = m + 1;
				} break;
			case 4:
				dia = d + i;
				if (dia>=31){
					AUX = sumarDias - i;
					dia = 1 + AUX;
					mes = m + 1;
				} break;
			case 5:
				dia = d + i;
				if (dia>=32){
					AUX = sumarDias - i;
					dia = 1 + AUX;
					mes = m + 1;
				} break;
			case 6:
				dia = d + i;
				if (dia>=31){
					AUX = sumarDias - i;
					dia = 1 + AUX;
					mes = m + 1;
				} break;
			case 7:
				dia = d + i;
				if (dia>=32){
					AUX = sumarDias - i;
					dia = 1 + AUX;
					mes = m + 1;
				} break;
			case 8:
				dia = d + i;
				if (dia>=32){
					AUX = sumarDias - i;
					dia = 1 + AUX;
					mes = m + 1;
				} break;
			case 9:
				dia = d + i;
				if (dia>=31){
					AUX = sumarDias - i;
					dia = 1 + AUX;
					mes = m + 1;
				} break;
			case 10:
				dia = d + i;
				if (dia>=32){
					AUX = sumarDias - i;
					dia = 1 + AUX;
					mes = m + 1;
				} break;
			case 11:
				dia = d + i;
				if (dia>=31){
					AUX = sumarDias - i;
					dia = 1 + AUX;
					mes = m + 1;
				} break;
			case 12:
				dia = d + i;
				if (dia>=32){
					AUX = sumarDias - i;
					dia = 1 + AUX;
					mes = 1;
					ano = a + 1;
				} break;
			}
	}

}
