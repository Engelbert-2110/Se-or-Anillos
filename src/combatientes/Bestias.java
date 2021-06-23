package src.combatientes;

import src.dados.*;

public class Bestias extends Combatientes{
	
	private static int danioMaximo = 90;

	public Bestias(String nombre, int vida, int armadura){
		super(nombre, vida, armadura, Bestias.danioMaximo, false);
	}	
	
	@Override
	public int getAtaque(){
		return Dados.lanzarDados(0, Bestias.danioMaximo , 1, true);
	}
		
}