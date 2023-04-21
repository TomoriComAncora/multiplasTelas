package com.example.atividade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class principal extends AppCompatActivity {

    private Button bt_login, bt_cadastro, bt_sobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        getSupportActionBar().hide();
        iniciarComponentes();
        telas();


    }

    private void iniciarComponentes() {
        bt_login = findViewById(R.id.btLogin);
        bt_cadastro = findViewById(R.id.btCadastrar);
        bt_sobre = findViewById(R.id.btSobre);
    }

    private void telas() {
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(principal.this, login.class);
                startActivity(in);
            }
        });

        bt_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(principal.this, cadastro.class);
                startActivity(in2);
            }
        });

        bt_sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3 = new Intent(principal.this, Sobre.class);
                startActivity(in3);
            }
        });
    }
}