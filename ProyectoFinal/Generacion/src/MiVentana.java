
import java.awt.Color;

import javax.swing.JFrame;

public class MiVentana extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MiCanvas Canvas;

	
	public MiVentana(){
	    Canvas = new MiCanvas();
	    getContentPane().add(Canvas);
	    this.getContentPane().setBackground(Color.GRAY);
	    setTitle("Juego");
	}

}