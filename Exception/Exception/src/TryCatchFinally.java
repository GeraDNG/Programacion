import java.util.*;
import java.io.*;
public class TryCatchFinally {
	public static double division(int a, int b){
		double res=0;
		try{
			res=a/b;
			FileReader fi = new FileReader("SinArchivo.txt");
		}
		catch(ArithmeticException e){
			System.out.println("No se puede dividir entre 0");
			//e.printStackTrace();
		}
		catch(FileNotFoundException fe){
			System.out.println(fe.getMessage());
		}
		catch(Exception e){
			System.out.println("Otro error");
		}
		finally{
			System.out.println("Finally");
		}
		return res;
	}
	public static void main(String[] args){
		double res;
		res=division(4,2);
		System.out.println(" Res "+res);
	}
}
