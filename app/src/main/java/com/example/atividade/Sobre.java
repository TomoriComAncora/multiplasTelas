package com.example.atividade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sobre extends AppCompatActivity {

    private Button bt_ufms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        getSupportActionBar().hide();
        iniciarComponente();
        irUfms();


    }

    private void iniciarComponente() {
        bt_ufms = findViewById(R.id.redi_ufms);
    }

    private void irUfms() {
        bt_ufms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://cpan.ufms.br/")));
            }
        });
    }
}