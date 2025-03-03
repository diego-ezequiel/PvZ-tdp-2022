package Entidades.Plantas;

import java.awt.Image;
import java.awt.Toolkit;

import Entidades.Entidad;


public class Petacereza extends Planta {
	public Petacereza(int x, int y) {
		super(x,y);
		vida=50;
		daño=500;
		sprite= Toolkit.getDefaultToolkit().getImage("assets/sprites/Plants/CherryBoom/CherryBoom.gif");
		sprite= Toolkit.getDefaultToolkit().getImage("assets/sprites/Plants/CherryBoom/Boom.gif");
	}
	
	public int cantVida() {
		return vida;
	}
	
	public int cantDaño() {
		return daño;
	}
	
	public Image getSprite() {
		return sprite;
	}

	@Override
	public void recibirDaño(int daño) {
		
	}

	@Override
	public void atacar(Entidad entidad) {
		explotar();
	}

	private void explotar() {
		// BOOM
	}

}
