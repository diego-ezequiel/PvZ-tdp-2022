package Entidades.Zombies;

import java.awt.Image;
import java.awt.Toolkit;

public class Caracono extends Comun{
	public Caracono(int x, int y) {
		super(x, y);
		vida=300;
		daño=10;
		estaComiendo=false;
		actualizarSprite();
	}

	@Override
	public int cantVida() {
		return vida;
	}

	@Override
	public int cantDaño() {
		return daño;
	}

	@Override
	public Image actualizarSprite() {
		if(vida>120) {
			if(estaComiendo) 
				sprite=Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/ConeHeadZombie/ConeHeadZombieAttack.gif");
			else
				sprite=Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/ConeHeadZombie/ConeHeadZombie.gif");
		} else {
			super.actualizarSprite();
		}
		return sprite;
	}
	
	@Override
	public Image getSprite() {
		return sprite;
	}
}
