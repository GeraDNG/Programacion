import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Fondo{
	private int x,y,tamanio;
	private BufferedImage  imagen;

	public Fondo(){
		x=0;
		y=0;
		tamanio=300;
		//String nomImagen = "/Img/correr.gif";
		//File archImagen = new File(nomImagen);
		cargar();
	}
	public void cargar(){
        try {
        	imagen = ImageIO.read(getClass().getResource("/Img/back.png"));
        }
        catch (Exception e) {    
        	JOptionPane.showMessageDialog(null, this, "No se cargo", tamanio);
        }
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(imagen,x,y,1000,1000,null);
		
	} 

}