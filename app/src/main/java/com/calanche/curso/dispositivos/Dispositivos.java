package com.calanche.curso.dispositivos;


public class Dispositivos {
    
  int pantalla = 2;
    
   private int corneta = 3;
    
    public String identificacion = "iphone";
    
    protected int teclas = 2;
    
   int leds = 5;
    
    private int auxiliar = 1;
    
   protected int salidas = 2;
    
    public int procesadores = 4;
    
    
    
    
   private void reproduce ()
    
    {}
    
    public void suena ()
    
    {}
    
  void  interpreta ()
    
    {}
    
   public void entretiene ()
    
    {}
    
    protected void actualiza ()
    
    {}
    
    void estereo ()
    {
        
        Dispositivos radio = new Dispositivos();
        
        radio.corneta = 4;  // acceso privado
        radio.auxiliar = 2; //acceso privado
        
        radio.reproduce(); //metodo de acceso privado
        
    }
    
}
