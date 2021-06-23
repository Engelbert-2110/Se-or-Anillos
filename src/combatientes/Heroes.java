package src.combatientes;

import src.dados.*;

public class Heroes extends Combatientes{
	
	private static int danioMaximo = 100;

	private static int instanciasHeroes;

	public Heroes(String nombre, int vida, int armadura){
		super(nombre, vida, armadura, Heroes.danioMaximo, true);
		Heroes.instanciasHeroes++;
	}	
	
	public static int getInstancias(){
		return Heroes.instanciasHeroes;
	}
	
	@Override
	public int getAtaque(){
		return Dados.lanzarDados(0, Heroes.danioMaximo, 2, true);
	}
		
}