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

        // Añadiendo el.contecto a la aplicación
        setContentView(panatalla);
    }
}
//esto es un comentario de una sola linea

/* esto es un comentario de varias lineas
continua aqui */

/** comentario de varias lineas
de documentacion */

// clase #1 conceptos de POO

// practica de la clase atributos y metodos


//aprendiendo a instancear una clase

Planta girasol = new Planta();

//propiedades o atributos del girasol

girasol.edad= 10;
girasol.nombre= "Pepe";
girasol.sexo= 'M';
girasol.tamano= 50;

// metodos o acciones

girasol.crece();
girasol.duerme();
girasol.respira();

// instanceando planta de cafe

Planta cafe = new Planta();

//atributos del cafe

cafe.edad= 50;
cafe.nombre="Ruffy";
cafe.sexo='M';
cafe.tamano=200;

// metodos del cafe

cafe.duerme();
cafe.respira();
cafe.duerme();

Planta arroz = new Planta();

arroz.edad= 300;
arroz.nombre="Ana";
arroz.sexo='F';
cafe.tamano= 15;


// metodos del arroz

arroz.crece();
arroz.respira();
arroz.duerme();


class Planta {   // clase planta
    
    /* atributos de la clase planta los 
    cuales se generan con la finalidad de
    entender y memorizar los conceptos */
    
    int edad =12;
    int tamano =20;
    string nombre ="maiz";
    char sexo ='f';
    
    
    /** metodos de la clase planta
    -respira=metodo que mantiene con vida
    -crece=metodo que hace cambiante
    -duerme=metodo que desarrolla */
    
    void respira()
    {
        
    }
    
    void crece()
    {
        
    }
    
    void duerme()
    {
        
    }
    
    
    
    
    
}