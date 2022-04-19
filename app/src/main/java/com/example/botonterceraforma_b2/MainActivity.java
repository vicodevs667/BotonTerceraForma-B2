package com.example.botonterceraforma_b2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Atributos
    private TextView txtResultado;
    private EditText etPalabra;
    private Button btnInvertir, btnMensaje;

    private String palabra;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Este metodo permite que nuestro diseño se muestre como la pantalla
        setContentView(R.layout.activity_main);
        inicializarVistas();
        //Configurar a los botones para que puedan estar atentos a los eventos click
        /*
           Métodos -> recibir inputs, parametros o argumentos.....
                    parametros de tipo Primitivas....(int, String, float)
                    parametros de tipo Objeto-- instancias de una clase
                    parametros de tipo funcion --> funciones anonimas o funciones lambda o funciones flecha
                    ejemplo en Javascript -- map, filter
                    como parametro una funcion, ese metodo que recibe la funcion como parametro
                    ejecuta esa funcion pero en un ambito local
         */
        //3era forma la funcion anonima se activa de forma local
        //solamente para el boton en cuestion
        btnInvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obtenerInformacion();
                invertirPalabra();
            }
        });// esperando una funcion anonima como parametro
    }

    private void inicializarVistas() {
        txtResultado = findViewById(R.id.txtResultado);
        etPalabra = findViewById(R.id.etPalabra);
        btnInvertir = findViewById(R.id.btnInvertir);
        btnMensaje = findViewById(R.id.btnMensaje);
    }

    private void obtenerInformacion() {
        palabra = etPalabra.getText().toString();
    }

    private void invertirPalabra() {
        // separar palabras - array
        String invertido = "";
        /*
         En Java existe una funcion o metodo que les permite
         analizar una cadena como un vector, cada letra de la
         cadena es asociada a un indice como en un array.
         Ese metodo les devuelve una letra en determinada posicion
         como si quisieran un elemento en un indice de un array
         --Cuidado: La cadena es un String, las letras que componen una
            cadena son concidas como un char
            String -> hola ---- en la posicion 0 tienen el char -> h
                      0123 ---tamaño=4
         */
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertido = invertido + palabra.charAt(i);
        }
        txtResultado.setText(invertido);
    }
}



















