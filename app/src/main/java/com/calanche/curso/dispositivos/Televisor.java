package com.calanche.curso.dispositivos;

public class Televisor {
    
    
    
    
  void smart (){
        
    Dispositivos smarttv = new Dispositivos();
    
        smarttv.identificacion = "entretenimiento"; // control publico
        smarttv.pantalla = 1; // control de acceso por default
        smarttv.leds = 2;     // control de acceso por default
        smarttv.procesadores = 2; // control de acceso publico
        smarttv.salidas= 4;      // control de acceso protegido
        smarttv.teclas = 8;   ? // control de acceso protegido
        
        
        smarttv.actualiza(); // control de acceso protegido
        smarttv.entretiene(); // control de acceso publico
        smarttv.interpreta();  // control de acceso default
        smarttv.suena();  // control de acceso publico
        
        
    }
}
