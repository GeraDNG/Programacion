import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Plataforma extends Canvas{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x, y,tamX,tamY;
	private Color color;
	private Random r;
	
	public Plataforma(){
		super();
		r=new Random();
		x=985;
		y=930;
		tamX=48;
		tamY=50;
		color=new Color(r.nextInt());
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getTamX() {
		return tamX;
	}
	public void setTamX(int tamX) {
		this.tamX = tamX;
	}
	public int getTamY() {
		return tamY;
	}
	public void setTamY(int tamY) {
		this.tamY = tamY;
	}
	
	public void paint(Graphics g){
		g.setColor(color);
		g.fillRect(getX(), getY(), getTamX(), getTamY());
	}
	public void avanza(){
		x=x-getTamX();
	}
}
