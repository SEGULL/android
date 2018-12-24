package com.example.octavapp;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {	 
	 //variables de tipo local
	private EditText campo1;
	private EditText campo2;
	private TextView respuesta;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        campo1=(EditText)findViewById(R.id.input_1);
        campo2=(EditText)findViewById(R.id.input_2);
        respuesta=(TextView)findViewById(R.id.Respuesta_1);
    }
    public void funcionmostrar(View view){
    	
    	String campo1_espera = campo1.getText().toString();
    	String campo2_espera = campo2.getText().toString();
    	/* REALIZAMOS CONVERCIONES DE STRING A INT*/
    	int campo1_convertido = Integer.parseInt(campo1_espera);
    	int campo2_convertido = Integer.parseInt(campo2_espera);
    	/*REALIZAMOS LA SUMA PERO CON CONVERCION A DOUBLE*/
    	Double respuesta1 = (double) (campo1_convertido+campo2_convertido);
    	/*REALIZAMOS OTRA CONVERSION DE DOUBLE A STRING*/
    	String respuesta_convertida =String.valueOf(respuesta1); 
    	/*ENVIAMOS LA RESPUESTA DE MODO TEXTO CON EL METODO setText*/
    	respuesta.setText(respuesta_convertida);
    	
    	/*CONCATENAMOS LETRAS */
        //String campo_concatenado = campo1_espera+campo2_espera;
    	//respuesta.setText(campo_concatenado);
    	
    	
    	//respuesta.setText(campo1.getText().toString());
    }
    
    
 

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
