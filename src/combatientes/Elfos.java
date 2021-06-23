package src.combatientes;

import src.dados.*;

public class Elfos extends Heroes{
	
	    public Elfos(String nombre){
        super(nombre, 250, 10);
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un elfo y me llamo: "+this.nombre);
    }

    @Override
    public int darAtaque(Combatientes defiende){
        if (defiende instanceof Orcos){
            System.out.println(" "+ this.getNombre() + " rabia del elfo ");
            return this.getAtaque() + 10;
        }
        return this.getAtaque();
    }
}