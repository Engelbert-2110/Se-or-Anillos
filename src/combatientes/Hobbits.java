package src.combatientes;

import src.dados.*;

public class Hobbits extends Heroes{
	
	private static int contadorInstancias;
	
	    public Hobbits(String nombre){
        super(nombre, 200, 12);
		Hobbits.contadorInstancias++;
    }

	public static int getInstancias(){
        return Hobbits.contadorInstancias;
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un Hobbit y me llamo: "+this.nombre);
    }

    @Override
    public int darAtaque(Combatientes defiende){
        if (defiende instanceof Trasgos){
            System.out.println(" "+ this.getNombre() + " oh no! es un Trasgo!!! ");
            return this.getAtaque() - 5;
        }
        return this.getAtaque();
    }
}