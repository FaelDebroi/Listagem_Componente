package com.example.componentesdelistagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.componentesdelistagem.activity.AprendendoRecyclerView;

public class MainActivity extends AppCompatActivity {
    private ListView listlocais;
    private String[] locais = {
    "Angra dos Reis","Caudas novas","Campo dos jordao","Costa do Saipe",
    "ilheus","posto Seguro","tira dentes","Caribe"
    };

    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listlocais= findViewById(R.id.listaLocais);

        //criar adptador para lista
        ArrayAdapter<String> adaptador= new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_list_item_1,android.R.id.text1,locais
        );
        //adicionar adaptador para a lista
        listlocais.setAdapter(adaptador);

        Button= findViewById(R.id.BtnRecyclearView);

        Button.setOnClickListener(view -> {
            Intent intent = new Intent(this, AprendendoRecyclerView.class);
            startActivity(intent);
        });
    }



}