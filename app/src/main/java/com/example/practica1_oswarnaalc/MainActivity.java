package com.example.practica1_oswarnaalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edNombre;
    String nameUser;
    Button miBoton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miBoton = findViewById(R.id.bt_login);
        miBoton.setOnClickListener(clik);

    }
    View.OnClickListener clik = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            edNombre = findViewById(R.id.et_name);
            nameUser = String.valueOf(edNombre.getText());
            Intent  in = new Intent(MainActivity.this, MainActivity2.class);
            in.putExtra("Usuario",nameUser);
            startActivity(in);
            //intrucciones que realizara al dar click
           /* edNombre = findViewById(R.id.et_name);
            nameUser = String.valueOf(edNombre.getText());
            Toast.makeText(getBaseContext(),"hola " + nameUser,Toast.LENGTH_SHORT).show();

            */
        }
    };
   /* public void clic (View Vista){
        edNombre = findViewById(R.id.et_name);
        nameUser = String.valueOf(edNombre.getText());
        Toast.makeText(getBaseContext(),"hola " + nameUser,Toast.LENGTH_SHORT).show();
    }

    */
}