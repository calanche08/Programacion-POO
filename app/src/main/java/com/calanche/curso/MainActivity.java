package com.calanche.curso;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout panatalla; // Pantalla donde vamos a mostrar el contenido

    private TextView texto; // Propiedad para mostrar un texto

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        panatalla = new LinearLayout(this); // Imstanciando clase

        texto = new TextView(this); // Imstanciando clase

        texto.setText("Hola Mundo"); // Qñqdiendo un texto para mostrar

        // aqui se coloca las instancias
        
        Computadoras telefono = new Computadoras();
        
        //atributos de telefono
        telefono.memoria = 2;
        
        telefono.procesador = 8;
        
        telefono.pantalla = 1;
        
        telefono.nombre = "redmi";
        
        //metodos
        
        telefono.almacena();
        
        telefono.entretiene();
        
        telefono.reproduce();
        
        //instanciando clase avion
        Avion helicoptero = new Avion();
        
        //atributos
        
        helicoptero.aspas = 2;
        
        helicoptero.luces = 5;
        
        helicoptero.alas = 2;
        
        
        // metodos
        
        helicoptero.vuela();
        
        helicoptero.transporta();
        
        //intanciando clase casa
        
        Casa mansion = new Casa();
        
        //atributos de mansion
        
        mansion.ventana = 30;
        
        mansion.puerta = 20;
        
        mansion.pared = 50;
        
        // metodos de mansion
        
        mansion.almacena();
        
        mansion.protege();
        
        mansion.retiene();
        
        // Añadiendo el.contecto a la aplicación
        setContentView(panatalla);
    }
    
    
    // aqui genero mis nuevas clases
    
    class Computadoras {
        
        // atributos de la clase
        int procesador = 1;
        int memoria = 2;
        int pantalla = 1;
        String nombre = "xiami";
        
        //metodos de la clase
        
        void reproduce()
        {}
        
        void almacena()
        {}
        
        void entretiene ()
        {}
        
        
    }
    
    class Avion {
        
        //atributos
        
        int alas = 2;
        int aspas = 3;
        int luces = 4;
        String nombre = "transporte";
        
        
        //metodos
        
        void vuela()
        {}
        
        void transporta ()
        {}
        
        void rueda ()
        {}
        
        
    }
    
    
    class Casa {
        
      //  atributos
        
        int pared = 1;
        int techo = 2;
        int ventana = 4;
        int puerta = 2;
        
        //propiedades
        
        void protege ()
        {}
        
        void almacena ()
        
        {}
        
        void retiene ()
        
        {}
        
        
    }
    
    
}

