package com.calanche.curso.plantas;
import com.calanche.curso.objetos.Objetos;

/* clase generada para poner en practica conceptos vistos 
hasta ahora, se intenta acceder a atributos
y metodos con diferentes configuracion de control de acceso**/

public class Platanos {
    
    Objetos platanoMediano = new Objetos ();
        
    
    void respira ()
    {
        
    Musaseas.sexo = "masculino"; // atributo estatico
        
        Musaseas.crece(); // metodo estatico
        
    }

    
    void reproducir ()
    {
        
        Musaseas platanoEnano = new Musaseas ();
        
        
        platanoEnano.capas=7;
        platanoEnano.hojas=8;
        platanoEnano.raices=10;
        platanoEnano.respira();
        platanoEnano.siente();
        
        
        
        
    }

}
