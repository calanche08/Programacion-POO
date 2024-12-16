package com.calanche.curso.plantas;
import com.calanche.curso.objetos.Objetos;

/* clase generada para poner en practica conceptos vistos 
hasta ahora, se intenta acceder a atributos
y metodos con diferentes configuracion de control de acceso**/

public class Platanos {
    
    Objetos platanoMediano = new Objetos ();
    
        public int flores = 50;
    //generando atributos para objeto this
    protected static String color = "verde";
    
    private boolean fotosintesis = true;
    
    
    
    
    void respira ()
    {
        
    Musaseas.sexo = "masculino"; // atributo estatico
        
        Musaseas.crece(); // metodo estatico
        
        
        
        // recogiendo valores retornado
        
        int alimento = this.frutos();
        
        String cubre = forraje();
        
        
    }

    
    void reproducir ()
    {
        
        Musaseas platanoEnano = new Musaseas ();
        
        
        platanoEnano.capas=7;
        platanoEnano.hojas=8;
        platanoEnano.raices=10;
        platanoEnano.respira();
        platanoEnano.siente();
        
        
        new Platanos().flores=30;
        new Platanos().fotosintesis=false;
        
        
        this.flores=30;
        this.fotosintesis=false;
        
        fotosintesis=true;
        flores=4;
        
    }
  // metodo que retorna un valor
    public int frutos()
    
    {
        
        int total = 40;
        
        return total;
        
        
    }
    
    
    private static final String forraje ()
    
    {
        
        String adorno = "abundante";
        
        return adorno;
        
        
    }
    
    
    
}
