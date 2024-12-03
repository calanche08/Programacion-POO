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
        
        radio.corneta = 4;
        radio.auxiliar = 2;
        
        radio.reproduce();
        
    }
    
}


class Televisor {
    
    
    
  void smart (){
        
    Dispositivos smarttv = new Dispositivos();
    
        smarttv.identificacion = "entretenimiento"; // control publico
        smarttv.pantalla = 1; // control de acceso por default
        smarttv.leds = 2;     // control de acceso por default
        smarttv.procesadores = 2; // control de acceso publico
        smarttv.salidas= 4;      // control de acceso protegido
        smarttv.teclas = 8;    // control de acceso protegido
        
        
        smarttv.actualiza(); // control de acceso protegido
        smarttv.entretiene(); // control de acceso publico
        smarttv.interpreta();  // control de acceso default
        smarttv.suena();  // control de acceso publico
        
        
    }
    
}