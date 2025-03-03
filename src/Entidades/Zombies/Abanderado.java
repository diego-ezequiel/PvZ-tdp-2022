package Entidades.Zombies;

import java.awt.Image;
import java.awt.Toolkit;


public class Abanderado extends Zombie {
	public Abanderado(int x, int y){
		super(x,y);
		daño=10;
		vida=120;
		height=108;
		width=85;
		estaComiendo=false;
		actualizarSprite();
	}

	public int cantVida() {
		return vida;
	}

	public Image actualizarSprite() {
		if(vida>20) {
			if(estaComiendo) 
				sprite=Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/FlagZombie/FlagZombieAttack.gif");
			else 
				sprite=Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/FlagZombie/FlagZombie.gif");
		}
		else {
			if(estaComiendo)
				sprite=Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/FlagZombie/FlagZombieLostHeadAttack.gif");
			else
				sprite=Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/FlagZombie/FlagZombieLostHead.gif");
		}
		return sprite;
	}

	public Image getSprite() {
		return sprite;
	}

	@Override
	public int cantDaño() {
		return daño;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}
}
