package Logica;

import Entidades.Entidad;

public class Patio {
	private final static int FIL=6, COL=9;
	protected Entidad grilla[][];
	
	public Patio() {
		grilla = new Entidad[FIL][COL];
		for(int f=0; f<FIL ; f++) 
			for(int c=0; c<COL; c++)
				grilla[f][c] = null;
	}
}
