package Entidades;

import java.awt.Image;

public abstract class Entidad {
	protected int vida;
	protected int daño;
	protected int x, y, width, height;
	protected Image sprite;
	
	public Entidad() {
		
	}
	
	public void recibirDaño(int daño) {
		vida-=daño;
		if (vida<=0) {
			borrarEntidad(this);
		}
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public abstract Image getSprite() ;
	
	public abstract int cantDaño();
	
	public abstract void atacar(Entidad entidad);
	
	public void borrarEntidad(Entidad entidad) {
		
	}
}
