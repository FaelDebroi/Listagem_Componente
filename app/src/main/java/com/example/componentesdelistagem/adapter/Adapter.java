package com.example.componentesdelistagem.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.componentesdelistagem.R;
import com.example.componentesdelistagem.model.Filmes;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Filmes> listaFilmes;
    public Adapter(List<Filmes> lista ) {
        this.listaFilmes = lista;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        //Cria as visualizacoes
        //ele esta convertendo os arquivos xml
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista,parent,false);
        return new MyViewHolder(itemLista);

    }

    @Override
    public void onBindViewHolder(Adapter.MyViewHolder holder, int position) {

        Filmes filme = listaFilmes.get(position);
        //exibicao dos itens
        holder.titulo.setText(filme.getFilme());
        holder.Ano.setText(filme.getAno());
        holder.genero.setText(filme.getGenero());
        holder.Classificacao.setText(filme.getClassificacao());
    }

    @Override // retorna a quantidade de itens que vao ser irseridos
    public int getItemCount() {
        return listaFilmes.size();
    }

    //metodo para exportar o ViewHolder
    //ViewHolder responsavel por multiplicar os dados da lista
    public class MyViewHolder extends RecyclerView.ViewHolder{


        TextView titulo, Ano, genero, Classificacao;


        public MyViewHolder(View itemView) {
            super(itemView);
            Classificacao = itemView.findViewById(R.id.Classificacao);
            titulo = itemView.findViewById(R.id.textTitulo); //CTROL + SHIFT
            genero = itemView.findViewById(R.id.textGenero); //CTROL + D
               Ano = itemView.findViewById(R.id.textAno);
        }
    }
}
