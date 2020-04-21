public class Puntuaciones {
	private int[] punt=new int[11];
	
	public Puntuaciones(){
		for(int i=0;i<10;i++){
			punt[i]=0;
		}
	}
		
	public void agregar(int a){
		punt[10]=a;
		topTen();
	}
	
	public void topTen(){
		int i,j,aux;
		for(i=0;i<punt.length-1;i++){
			for(j=0;j<punt.length-i-1;j++){
				if(punt[j+1]<punt[j]){
					aux=punt[j+1];
					punt[j+1]=punt[j];
					punt[j]=aux;
				}
			}
		}
	} 
}