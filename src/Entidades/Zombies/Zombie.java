package Entidades.Zombies;

import java.awt.Image;
import java.awt.Rectangle;

import Entidades.Entidad;
import Entidades.Plantas.Planta;

public abstract class Zombie extends Entidad {
	private int contadorMovimiento;
	protected boolean estaComiendo;
	
	public Zombie(int x,int y) {
		this.x=x;
		this.y=y;
		this.width=93;
		this.height=125;
	}

	public void mover() {
	    if (!getEstaComiendo()) {
	        contadorMovimiento++;
	        if (contadorMovimiento >= 5) {
	            this.x--; // Mover 1 píxel
	            contadorMovimiento = 0;
	        }
	    }
	}

	public void setX(int x) {
		this.x+=x;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x+30, y, width, height);
	}
	
	@Override
	public void atacar(Entidad entidad) {
		comerPlanta((Planta)entidad); // Dudoso xd
	}
	
	public void comerPlanta(Planta planta) {
		if(!this.getEstaComiendo()) {
		    setEstaComiendo(true);
		    actualizarSprite();
		    planta.recibirDaño(cantDaño());
		    setEstaComiendo(false);
		    if(planta.estaMuerta()) {
		       planta.borrarEntidad(planta);
		       setEstaComiendo(false);
		       actualizarSprite();
		    }
		}
	}

	public abstract Image actualizarSprite();
	
	public abstract int cantVida();
	
	public boolean estaMuerto() {
		return cantVida()<=0;
	}
	
	public void setEstaComiendo(boolean comiendo) {
		this.estaComiendo=comiendo;
	}

	public boolean getEstaComiendo() {
		return estaComiendo;
	}
}
