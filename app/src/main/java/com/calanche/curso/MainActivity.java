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

        
        // instanciando clase Planta
        
        Planta girasol = new Planta();
        
        girasol.edad = 10;
        
        girasol.nombre="pepe";
        
        girasol.sexo='M';
        
        girasol.tamano=50;
        
        girasol.crece();
        
        girasol.duerme();
        
        girasol.respira();
        
        Planta cafe = new Planta();
        
        cafe.edad = 50;
        
        cafe.nombre="ruffy";
        
        cafe.sexo ='M';
        
        cafe.tamano =200;
        
        
        cafe.crece();
        
        cafe.duerme();
        
        cafe.respira();
        
        
        Planta arroz = new Planta();
        
        arroz.edad = 300;
        
        arroz.nombre="anna";
        
        arroz.sexo ='F';
        
        arroz.tamano =15;
        
        
        arroz.crece();
        
        arroz.duerme();
        
        arroz.respira();
        
        
        // Añadiendo el.contecto a la aplicación
        setContentView(panatalla);
    }
    
    class Planta {   // nueva clase Planta
        
        //atributos de clase planta
        
        int edad =12;
        int tamano = 20;
        String nombre ="maiz";
        char sexo ='F';
        
        
        //metodos de la clase planta
        
        void respira()
        {}
        
        void crece()
        {}
        
        void duerme()
        {}
        
        
    }
    
    
    
    
    
    
    
    
}

