package Entidades.Zombies;

import java.awt.Image;
import java.awt.Toolkit;

public class Comun extends Zombie{
	public Comun(int x,int y){
		super(x,y);
		vida=120;
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

	public Image actualizarSprite() {
		if(vida>20) {
			if(estaComiendo) 
				sprite=Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/Zombie/ZombieAttack.gif");
			else
				sprite=Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/Zombie/Zombie.gif");
		}
		else {
			if(estaComiendo)
				sprite=Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/Zombie/ZombieLostHeadAttack.gif");
			else
				sprite=Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/Zombie/ZombieLostHead.gif");
		}	
		return sprite;
	}

	@Override
	public Image getSprite() {
		return sprite;
	}
}
