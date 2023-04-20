package com.example.atividade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText txt_usuario, txt_senha;
    Button bt_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
        iniciandoComponentes();

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(txt_usuario.getText().toString().equals("") || txt_senha.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "por favor preencha os campos", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "parabens, entrou!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void iniciandoComponentes(){
        txt_usuario = findViewById(R.id.edit_usuario);
        txt_senha = findViewById(R.id.edit_senha);
        bt_entrar = findViewById(R.id.bt_entrar);
    }


}