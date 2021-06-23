package src.combatientes;

import src.dados.*;

public class Trasgos extends Bestias{
	
	private static int contadorInstancias;

    public static int getInstancias(){
        return Trasgos.contadorInstancias;
    }

    public Trasgos(String nombre){
        super(nombre, 325, 8);
		Trasgos.contadorInstancias++;
    }
}