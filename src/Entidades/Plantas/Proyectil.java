package Entidades.Plantas;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Proyectil{
	protected int x,y,width, height;
	protected Image sprite;
	protected int daño;
	
	public Proyectil(int x, int y, int dmg) {
		this.x=x;
		this.y=y;
		this.daño=dmg;
		width=height=55;
		sprite = Toolkit.getDefaultToolkit().getImage("assets/sprites/Plants/PB00.png");
	}
	
	public void mover() {
		    x += 1; // Velocidad del proyectil
		    if (x > 1000) { // Si sale del mapa
		    	// Borrar
		    }
	}
	

	public Image getSprite() {
		return sprite;
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
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}

	public int cantDaño() {
		return daño;
	}
}
