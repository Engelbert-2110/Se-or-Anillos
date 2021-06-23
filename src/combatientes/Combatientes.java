package src.combatientes;

import src.dados.*;

public class Combatientes{
	
	protected String nombre;
	protected int vida;
	protected int armadura;
	protected int ataque;
	protected boolean esBueno;
	
	private static int instanciasCombatientes;
	
	public Combatientes(String nombre, int vida, int armadura, int ataque, boolean esBueno){
		this.nombre = nombre;
		this.vida = vida;
		this.armadura = armadura;
		this.ataque = ataque;
		this.esBueno = esBueno;
		instanciasCombatientes++;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getVida(){
		return this.vida;
	}
	
	public int getArmadura(){
		return this.armadura;
	}

	public int getAtaque(){
		return this.ataque;
	}
	
	public boolean getBueno(){
		return this.esBueno;
	}
	
	public int darArmadura(Combatientes ataca){
		return this.getArmadura();
	}
	
	public int darAtaque(Combatientes defiende){
		return this.getAtaque();
	}
	
	public void recibirAtaque(Combatientes ataca){
		System.out.println(" "+ ataca.getNombre()+" ataca a: "+this.getNombre());
		
		int danioreceived = this.darArmadura(ataca) - ataca.darAtaque(this);
		if (danioreceived <= 0){
			this.vida += danioreceived;
		}else {
			danioreceived = 0;
		}
		
		System.out.println(" "+ataca.getNombre()+" ataco a: "+this.getNombre()+" hizo daño: "+danioreceived+" le queda vida: "+this.getVida());
	}
	
	public static int getInstancias(){
        return Combatientes.instanciasCombatientes;
    }
	
	 public void saludar(){
        System.out.println("Hola soy " + this.nombre);
    }
	
}