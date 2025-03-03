package Entidades.Plantas;

import java.awt.Rectangle;

import Entidades.Entidad;

public abstract class Planta extends Entidad {
	public Planta(int x, int y) {
		this.x=x;
		this.y=y;
		this.height=73;
		this.width=70;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}
	
	public abstract int cantVida();
	
	public boolean estaMuerta() {
		return cantVida()<=0;
	}
}
