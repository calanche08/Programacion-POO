package com.calanche.curso.objetos;

public class Objetos {
    
    int patas = 1;
    
   int tornillos = 3;
    
    private int clavos = 4;
    
   private int superficie = 1;
    
   public int ruedas = 2;
    
   protected String identificacion ="meson";
    
    
   protected void sostiene ()
    
    {}
    
   public void excibe ()
    
    {}
    
   void almacena ()
    
    {}
    
     private void optimiza ()
    
    {}
    
    void peinadora () 
    {
        
        Objetos peinador = new Objetos();
        
        // instanciando metodos y atributos privados
        
        peinador.clavos = 50;
        peinador.superficie = 1;
        
        peinador.optimiza();
        
        
    }
    
    void almacena (int pertenencias)
  
    {}
    
    void almacena (String libros, int ropa)
    
    {}
    
}
