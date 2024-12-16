package com.calanche.curso.personas;
//import com.calanche.curso.personas.Personas;


//empleando concepto de herencia

public class Venezolanos extends Personas {
    
    
    private String colorPiel = "blanco";
    
    public int lunares = 6;
    
    protected boolean amargado = true;
    
    
    Venezolanos() // metodo constructor
    {
        
        // empleando atributos de la sub clase con this
        
        this.colorPiel = "moreno";
        this.amargado = false;
        this.lunares = 7;
        
        // empleando atributos de la superclase con super
        
        super.brazos = 2;
        super.cabello = "largo";
        super.colorCabello = "marron";
       // super. __ no se puede acceder al atributo privado colorOjos
        super.piernas = 2;  // accediendo a atributo protegido a traves de la herencia
        super.dedos = 20;
        super.pecas = 7;  // accediendo a atributo protegido a traves de la herencia
         



    }
    
    
}
