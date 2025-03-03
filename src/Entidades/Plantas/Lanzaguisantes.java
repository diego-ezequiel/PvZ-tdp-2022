package Entidades.Plantas;

import java.awt.Image;
import java.awt.Toolkit;

import Entidades.Entidad;

public class Lanzaguisantes extends Planta {
	private Proyectil proyectil;
	private long ultimoDisparo = 0;
	private final long COOLDOWN = 2500; // 2.5 segundo en milisegundos
	
	public Lanzaguisantes(int x,int y) {
		super(x,y);
		vida=100;
		daño=10;
		sprite= Toolkit.getDefaultToolkit().getImage("assets/sprites/Plants/Peashooter/Peashooter.gif");
	}

	public int cantVida() {
		return vida;
	}


	public int cantDaño() {
		return daño;
	}

	public Proyectil disparar() {
	    long ahora = System.currentTimeMillis();
	    if (ahora - ultimoDisparo >= COOLDOWN) {
	        ultimoDisparo = ahora;
	        proyectil = new Proyectil(x-10, y-5, daño);
	        return proyectil;
	    }
	    return null;
	}

	
	public Image getSprite() {
		return sprite;
	}
	
	@Override
	public void recibirDaño(int daño) {
		vida-=daño;
		if(vida<=0) {
			//Morir
		}
	}

	@Override
	public void atacar(Entidad entidad) {
		disparar();
	}
}
