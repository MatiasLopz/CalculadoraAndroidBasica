package com.example.proyectooperaciones;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText e1, e2;
	TextView tv;
	

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);
        tv = (TextView)findViewById(R.id.textView3);
    }

  public void sumar (View v){
	  String dato1=e1.getText().toString();
	  String dato2=e2.getText().toString();
	  
	  if (dato1.equals("")||dato2.equals("")){
		  Toast t1= Toast.makeText(this, "Ingresar dígitos", Toast.LENGTH_LONG);
		  t1.show();
	  }
	  else
	  {
		  int n1=Integer.parseInt(dato1);
		  int n2=Integer.parseInt(dato2);
		  int resultado=n1+n2;
		  tv.setText(String.valueOf(resultado));  
	  }  
  }
  public void restar (View v){
	  String dato1=e1.getText().toString();
	  String dato2=e2.getText().toString();
	  
	  if (dato1.equals("")||dato2.equals("")){
		  Toast t1= Toast.makeText(this, "Ingresar dígitos", Toast.LENGTH_LONG);
		  t1.show();
	  }
	  else
	  {
	  int n1=Integer.parseInt(dato1);
	  int n2=Integer.parseInt(dato2);
	  int resultado=n1-n2;
	  tv.setText(String.valueOf(resultado));
	  }
  }
  public void dividir (View v){
	  String dato1=e1.getText().toString();
	  String dato2=e2.getText().toString();
	  
	  if (dato1.equals("")||dato2.equals("")){
		  Toast t1= Toast.makeText(this, "Ingresar dígitos", Toast.LENGTH_LONG);
		  t1.show();
	  }
	  else
	  {
	  int n1=Integer.parseInt(dato1);
	  int n2=Integer.parseInt(dato2);
	  float resultado=n1/n2;
	  tv.setText(String.valueOf(resultado));
	  }
  }
  public void multiplicar (View v){
	  String dato1=e1.getText().toString();
	  String dato2=e2.getText().toString();
	  
	  if (dato1.equals("")||dato2.equals("")){
		  Toast t1= Toast.makeText(this, "Ingresar dígitos", Toast.LENGTH_LONG);
		  t1.show();
	  }
	  else
	  {
	  int n1=Integer.parseInt(dato1);
	  int n2=Integer.parseInt(dato2);
	  int resultado=n1*n2;
	  tv.setText(String.valueOf(resultado));
	  }
  }
}
