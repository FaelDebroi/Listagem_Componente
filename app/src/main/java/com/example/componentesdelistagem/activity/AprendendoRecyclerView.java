package com.example.componentesdelistagem.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.componentesdelistagem.R;
import com.example.componentesdelistagem.RecyclerItemClickListener;
import com.example.componentesdelistagem.adapter.Adapter;
import com.example.componentesdelistagem.model.Filmes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AprendendoRecyclerView extends AppCompatActivity {

    private RecyclerView Rcv;
    private List<Filmes> listaFIlmes =  new ArrayList<>();
    String[] Filmes = {"AnnaBele","Liga da justica ","magico de oz","Vigandares","supermen"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprendendo_recycler_view);
        Rcv = findViewById(R.id.recyclerView);

        //litagem de filmes
        this.criarFilmes();

        //Configurar adapter
        Adapter adapter = new Adapter(listaFIlmes);

        //configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        Rcv.setLayoutManager(layoutManager);
        Rcv.setHasFixedSize( true );
        Rcv.addItemDecoration( new DividerItemDecoration(this, LinearLayout.VERTICAL));
        Rcv.setAdapter(adapter );
        
        //Evento do click
        Rcv.addOnItemTouchListener(

                new RecyclerItemClickListener(
                        getApplicationContext(),
                        Rcv, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Toast.makeText(AprendendoRecyclerView.this, "Voce selecionou o filme "+Filmes[position], Toast.LENGTH_SHORT).show();//Clickar encima
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Filmes filminhos = listaFIlmes.get(position);
                        Toast.makeText(AprendendoRecyclerView.this, "Click  Longo "+ filminhos.getFilme() , Toast.LENGTH_SHORT).show();//clickar e segurar
                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                        Toast.makeText(AprendendoRecyclerView.this, "Teste"+ i, Toast.LENGTH_SHORT).show();//
                    }
                }
                ) {
                }
        );

    }

    public void criarFilmes(){



        Filmes filmes = new Filmes(Filmes[0], "terro" ,"2002","+14" );
        this.listaFIlmes.add(filmes);

        filmes = new Filmes(Filmes[1], "heroi" ,"2012","+12" );
        this.listaFIlmes.add(filmes);

        filmes = new Filmes(Filmes[2], "Magia" ,"2012","+18" );
        this.listaFIlmes.add(filmes);

        filmes = new Filmes(Filmes[3], "Heroi" ,"2020","+14" );
        this.listaFIlmes.add(filmes);

        filmes = new Filmes(Filmes[4], "Heroi" ,"2004","+12" );
        this.listaFIlmes.add(filmes);


    }
}