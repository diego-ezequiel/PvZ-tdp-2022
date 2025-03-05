package Logica;

import Entidades.Entidad;
import Entidades.Plantas.Planta;

public class Patio {
	private final static int FIL=5, COL=9;
	protected Entidad grilla[][];
	
	public Patio() {
		grilla = new Entidad[FIL][COL];
		for(int f=0; f<FIL ; f++) 
			for(int c=0; c<COL; c++)
				grilla[f][c] = null;
	}
	
	public void plantar(Planta p) {
		
	}
	
	public void quitar(Planta p) {
		
	}
	
	public void accionarCortaPasto() {
		
	}
	
	public void recogerSol() {
		
	}
}
