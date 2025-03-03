package Entidades.Zombies;

import java.awt.Image;
import java.awt.Toolkit;

public class Saltador extends Zombie {
	private boolean vara;

	public Saltador(int x, int y) {
		super(x,y);
		vida=300;
		daño=10;
		estaComiendo=false;
		actualizarSprite();
	}
	
	public int cantVida() {
		return vida;
	}
	
	public Image actualizarSprite() {//arreglar
		if(vara) {
			if(!estaComiendo)//usado como no esta saltando
				sprite=(Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/PoleVaultingZombie/PoleVaultingZombie"));
			else {
				saltar();
			}
		}
		else {
			if(estaComiendo) {
				if(vida>100)
					sprite=(Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/PoleVaultingZombie/PoleVaultingZombieAttack"));
				else
					sprite=(Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/PoleVaultingZombie/PoleVaultingZombieLostHeadAttack"));
			}
			else{
				if(vida>100) 
					sprite=(Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/PoleVaultingZombie/PoleVaultingZombieWalk"));
				else
					sprite=(Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/PoleVaultingZombie/PoleVaultingZombieLostHeadWalk"));
			}
		}
		return sprite;
	}

	
	private void saltar(){
		iniciarSalto(x);
		terminarSalto(x++);
		
	}
	
	private void iniciarSalto(int posIni) {
		sprite=Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/PoleVaultingZombie/PoleVaultingZombieJump.gif");
	}
	
	private void terminarSalto(int posFin) {
		sprite=Toolkit.getDefaultToolkit().getImage("assets/sprites/Zombies/PoleVaultingZombie/PoleVaultingZombieJump2.gif");
	}

	public Image getSprite() {
		return sprite;
	}

	@Override
	public int cantDaño() {
		return daño;
	}

}
