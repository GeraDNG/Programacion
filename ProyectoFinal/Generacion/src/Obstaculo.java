import java.awt.Color;
import java.awt.Graphics;

public class Obstaculo {
	private int x,y,tamX,tamY;
	
	public Obstaculo(){
		
	}
	public Obstaculo(int x,int y, int tX, int tY){
		this.x=x;
		this.y=y;
		tamX=tX;
		tamY=tY;
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
		g.setColor(Color.BLACK);
		g.fillRect(getX(), getY(), getTamX(), getTamY());
	}
	public void avanza(){
		x=x-getTamX();
	}
}
