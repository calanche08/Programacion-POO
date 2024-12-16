package com.calanche.curso;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private LinearLayout panatalla; // Pantalla donde vamos a mostrar el contenido

    private TextView texto; // Propiedad para mostrar un texto
    public TextView textoPractica;
    @Override
    protected void onCreate(Bundle savedInastanceState) {
        super.onCreate(savedInstanceState);

        panatalla = new LinearLayout(this); // Imstanciando clase
        texto = new TextView(this); // Imstanciando clase
       textoPractica = new TextView(this);
       
        texto.setText("Hola Mundo"); // Qñqdiendo un texto para mostrar
       textoPractica.setText(" entendiendo la practica");
        
        
        panatalla.addView(texto);
        // aqui se coloca las instancias
        
        panatalla.addView(textoPractica);
        
        // Añadiendo el.contecto a la aplicación
        setContentView(panatalla);
    }
    
    // aqui se agregan las clases
    
    
}

