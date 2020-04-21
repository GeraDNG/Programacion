import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Monito{
	private int x,y,tamanio;
	private BufferedImage  imagen;

	public Monito(){
		x=0;
		y=830;
		tamanio=100;
		//String nomImagen = "/Img/correr.gif";
		//File archImagen = new File(nomImagen);
		cargar();
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getTam(){
		return tamanio;
	}
	
	public void cargar(){
        try {
        	imagen = ImageIO.read(getClass().getResource("/Img/monito.gif"));
        }
        catch (Exception e) {    
        	JOptionPane.showMessageDialog(null, this, "No se cargo", tamanio);
        }
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(imagen,x,y,tamanio,tamanio,null);
		
	} 
	
	public void saltar(){
		y = 730;
	}
	public void bajar(){
		y = 830;
	}

}