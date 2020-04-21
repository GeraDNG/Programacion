import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.Timer;

public class MiCanvas extends Canvas implements ActionListener, KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Plataforma pla;
	Plataformas miPlataforma;
	Obstaculo obs;
	Obstaculos obstaculos;
	Monito	mon;
	//Fondo fondo;								//Eliminar comentario para ver imagen de fondo
	Puntuacion punt;
	Timer reloj;
	Random r;
	private boolean aux, pausa, menu;
	private int i;
	
	public MiCanvas() {
		super();
		//fondo = new Fondo();					//Eliminar comentario para ver fondo
		pla 		 = new Plataforma();
		miPlataforma = new Plataformas();
		obs 		 = new Obstaculo();
		obstaculos	 = new Obstaculos();
		mon = new Monito();
		punt = new Puntuacion();
		reloj = new Timer(100, this);
		reloj.start();
		r = new Random();
		addKeyListener(this);
		aux = false;
		pausa = true;
		menu = true;
		i = 0;
	}

	public void paint(Graphics g){
		//fondo.paintComponent(g);				//Eliminar comentario para ver fondo
		Graphics2D g2d = (Graphics2D) g;
		g.setColor(Color.WHITE);
		g2d.drawString(String.valueOf("Puntos: "+punt.getPuntaje()), 10, 30);
		miPlataforma.paint(g);
		obstaculos.paint(g);
		if((pausa==false && miPlataforma.size()>=21) || (pausa==true && miPlataforma.size()>=21))
			mon.paintComponent(g);
		if(menu==true){
			g.setColor(Color.BLACK);
			g.setFont( new Font( "E2D", Font.BOLD, 100 ));
			g.drawString("E2D", 350, 150);
			g.setColor(Color.BLACK);
			g.setFont( new Font( "Instrucciones", Font.BOLD, 40 ));
			g.drawString("Bienvenido a E2D", 10, 200);
			g.setFont( new Font( " ", Font.BOLD, 15 ));
			g.drawString("Instrucciones:", 10, 265);
			g.drawString("E2D es un juego de plataforma, donde debes evitar los objetos negros saltando.", 10, 285);
			g.drawString("Presiona espacio o la flecha arriba para saltar.", 10, 305);
			g.drawString("Sueltalas para bajar. Si no lo haces, bajará automaticamente", 10, 325);
			g.drawString("Para pausar, presiona la letra P.", 10, 345);
			g.drawString("Para comenzar el juego o quitar la pausa, presiona ENTER.", 10, 365);
			g.drawString("Consigue el mayor puntaje y vence a tus amigos.", 10, 385);
		}
	}	

	@Override
	public void actionPerformed(ActionEvent ae) {
		int a = r.nextInt(30);
		int b = r.nextInt(30);
		int c = r.nextInt(30);
		if(miPlataforma.size()>40){
			if(a==6){
				Obstaculo o = new Obstaculo(985,864,35,66);
				obstaculos.agregar(o);
			}
			if(b==6){
				Obstaculo o=new Obstaculo(985,905,35,25);
				obstaculos.agregar(o);
			}
			if(c==6){
				Obstaculo o=new Obstaculo(985,886,35,44);
				obstaculos.agregar(o);
			}
		}
		if(aux==true){
			i=i+1;
		}
		if(pausa==false){
			punt.score();
			obs = new Obstaculo();
			obstaculos.avanza();
			obstaculos.agregar(obs);
			pla=new Plataforma();
			miPlataforma.agregar(pla);
			miPlataforma.avanza();
		}
		repaint();
	}	
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			aux = true;
			salto();
			break;
		case KeyEvent.VK_SPACE:
			aux = true;
			salto();
			break;
		case KeyEvent.VK_P:
			pausa=true;
			menu=true;
			break;
		}
		repaint();
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			mon.bajar();
			aux = false;
			i = 0;
		break;
		case KeyEvent.VK_SPACE:
			mon.bajar();
			aux = false;
			i = 0;
			break;
		case KeyEvent.VK_ENTER:
			pausa=false;
			menu=false;
			break;
		}
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
	public void salto(){
		if(i<=10)
			mon.saltar();
		else{
			mon.bajar();
			aux = false;
		}
	}
	
	public void jugar(){
		if(pausa==true)
			reloj.stop();
		if(pausa==false)
			reloj.start();
	}

}
