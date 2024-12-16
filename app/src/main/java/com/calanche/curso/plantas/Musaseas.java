package com.calanche.curso.plantas;
import javax.crypto.Mac;

//clase generada para practicar conceptos
//vistos hasta ahora

public class Musaseas {
    
    //atributos de la clase
    
  public static String sexo= "asexual"; // empleando modificador static
    protected int hojas = 6; // control de acceso protegido
    int raices = 4;
    private final String fruto = "1 racimo"; // empleando modificador final
    final static int HIJOS = 4; // Generando una constante
    public int capas = 7;
    private int duracion= 1;
    
    
    //generando metodo constructor
    
    Musaseas ()
    
    {}
    
    
    public void respira ()
    
    {
        // realizando prueba de instanciar de diferentes maneras,
        // incluyendo metodo This
        
        Musaseas manzano = new Musaseas();
        
        manzano.capas= 8;
        
        new Musaseas().capas= 9;
        
        this.come(); // instanciando metodo
        
        this.capas=3; // instanciando atributo
        
        capas=8; // el compilador genera el this
        
    }
    
    private void come ()
    
         
    {
        Musaseas.sexo="femenino"; // empleando atributos estaricos sin instanciar objetos
    }
    
    protected void siente ()
    
    {
        
        new Musaseas().respira(); // instanciando implicitamente
        
        this.capas=2; // objeto this
        
    }
    
    protected void siente (String calor) // sobrecarga de metodos
    
    {}
    
    static void crece () //metodo estatico
    
    {
        
    }
    
    Musaseas (int especies)
    
    {} // sobrecarga de metodo constructor
    
    Musaseas (String reproduccion)
    
    {
        
        Musaseas cambur = new Musaseas(); // dato por referencia
        
        cambur.capas= 4;
        cambur.duracion=2;
        cambur.hojas=9;
        cambur.raices= 10;
        cambur.come();
        cambur.crece();
        cambur.respira();
        cambur.siente();
        
        
        int manchas = 20; // dato por valor
        
    }
    
    
}
