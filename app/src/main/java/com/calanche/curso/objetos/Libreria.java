package com.calanche.curso.objetos;

public class Libreria {
    
    
    
    void estante (){
        
    Objetos estante = new Objetos();
        
        estante.identificacion ="inmueble"; // protegido
        estante.ruedas = 4; // publico
        estante.tornillos = 20; // default
        estante.patas = 4; // default
        
        estante.almacena(); // default
        estante.excibe();  // publico
        estante.sostiene(); // protegido
        
        }
    
    }
