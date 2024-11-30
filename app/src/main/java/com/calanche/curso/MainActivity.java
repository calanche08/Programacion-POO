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
        
        
        
        // Añadiendo el.contecto a la aplicación
        setContentView(panatalla);
    }
    
    // aqui se agregan las clases
    
    
}

