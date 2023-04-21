package com.example.atividade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class cadastro extends AppCompatActivity {

    EditText edit_nome_usu, edit_sexo, edit_nasci, edit_tel, edit_usuario, edit_senha;
    Button bt_cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        getSupportActionBar().hide();
        iniciarComponentes();
        cadastro();


    }

    private void iniciarComponentes() {
        edit_nome_usu = findViewById(R.id.nome_cadast);
        edit_sexo = findViewById(R.id.sexo_cadast);
        edit_nasci = findViewById(R.id.nasci_cadast);
        edit_tel = findViewById(R.id.telef_cadast);
        edit_usuario = findViewById(R.id.usuario_cadast);
        edit_senha = findViewById(R.id.senha_cadast);
        bt_cadastrar = findViewById(R.id.bt_cadasto);
    }

    private void cadastro() {
        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit_nome_usu.getText().toString().equals("") || edit_sexo.getText().toString()
                        .equals("") || edit_nasci.getText().toString().equals("") || edit_tel.getText()
                        .toString().equals("") || edit_usuario.getText().toString().
                        equals("") || edit_senha.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Preencha todos os campos!!", Toast
                            .LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Cadastro realizado!!", Toast
                            .LENGTH_SHORT).show();
                }
            }
        });
    }
}