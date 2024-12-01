package com.calanche.curso;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.calanche.curso.dispositivos.Dispositivos;
import com.calanche.curso.objetos.Objetos;
import com.calanche.curso.personas.Personas;
import com.calanche.curso.vehiculos.vehiculos;

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
        
        Dispositivos telefono = new Dispositivos();
        
        telefono.pantalla = 1;
        
        telefono.teclas = 12;
        
        telefono.identificacion= "xiami";
        
        telefono.leds= 1;
        
        telefono.corneta = 2;
        
        telefono.actualiza();
        
        telefono.entretiene();
        
        telefono.interpreta();
        
        telefono.reproduce();
        
        Dispositivos computadora = new computadora();
        
        computadora.pantalla = 1;
        
        computadora.teclas = 40;
        
        computadora.corneta = 5;
        
        computadora.auxiliar = 2;
        
        computadora.identificacion = "compaq";
        
        computadora.leds = 4;
        
        computadora.procesadores = 16;
        
        computadora.actualiza();
        
        computadora.entretiene();
        
        computadora.interpreta();
        
        computadora.reproduce();
        
        computadora.suena();
        
        vehiculos carro = new vehiculos();
        
        carro.asientos = 5;
        
        carro.ruedas = 4;
        
        carro.luces = 2;
        
        carro.retrovisor = 2;
        
        carro.agiliza();
        
        carro.desplaza();
        
        carro.traslada();
        
        vehiculos moto = new vehiculos();
        
        moto.asientos = 1;
        
        moto.luces = 5;
        
        moto.retrovisor = 2;
        
        moto.ruedas = 2;
        
        moto.agiliza();
        
        moto.economiza();
        
        moto.traslada();
        
        moto.desplaza();
        
        Personas carlos = new Personas();
        
        carlos.brazos = 2;
        
        carlos.piernas = 2;
        
        carlos.cabello = "corto";
        
        carlos.color_cabello = "negro";
        
        carlos.color_ojos = "negros";
        
        carlos.dedos = 20;
        
        carlos.bebe();
        
        carlos.camina();
        
        carlos.come();
        
        carlos.corre();
        
        carlos.duerme();
        
        carlos.respira();
        
        Personas yissel = new Personas();
        
        yissel.brazos = 2;
        
        yissel.piernas = 2;
        
        yissel.cabello = "largo";
        
        yissel.color_cabello = "negro";
        
        yissel.color_ojos = "cafe";
        
        yissel.dedos = 20;
        
        yissel.bebe();
        
        yissel.camina();
        
        yissel.come();
        
        yissel.corre();
        
        yissel.respira();
        
        
        Objetos mesa = new Objetos();
        
        mesa.clavos = 8;
        
        mesa.patas = 4;
        
        mesa.superficie = 1;
        
        mesa.tornillos = 8;
        
        mesa.optimiza();
        
        mesa.sostiene();
        
        mesa.almacena();
        
        Objetos vitrina = new Objetos();
        
        vitrina.clavos = 30;
        
        vitrina.tornillos = 20;
        
        vitrina.ruedas = 4;
        
        vitrina.superficie = 3;
        
        vitrina.excibe();
        
        vitrina.almacena();
        
        vitrina.optimiza();
        
        vitrina.sostiene();
        
        
        // Añadiendo el.contecto a la aplicación
        setContentView(panatalla);
    }
    
    // aqui se agregan las clases
    
    
}

