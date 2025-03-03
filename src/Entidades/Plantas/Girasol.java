package Entidades.Plantas;

import java.awt.Image;
import java.awt.Toolkit;

import Entidades.Entidad;

public class Girasol extends Planta{
	public Girasol(int x,int y) {
		super(x,y);
		vida=100;
		daño=0;
		sprite= Toolkit.getDefaultToolkit().getImage("assets/sprites/Plants/SunFlower/SunFlower.gif");
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
		vida-=daño;
		if(vida<=0) {
			//Morir
		}
	}

	@Override
	public void atacar(Entidad entidad) {
		// No ataca
	}
}
