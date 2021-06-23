package src.combatientes;

import src.dados.*;

public class Humanos extends Heroes {

    private static int contadorInstancias;

    public Humanos(String nombre){
        super(nombre, 180, 15);
        Humanos.contadorInstancias++;
    }

    public static int getInstancias(){
        return Humanos.contadorInstancias;
    }
    
	@Override
    public void saludar(){
        System.out.println("Hola soy un Humano y me llamo: "+this.nombre);
    }
	
}