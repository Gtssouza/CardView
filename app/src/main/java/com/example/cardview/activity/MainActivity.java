package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Post> listaPost = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerView);

        //Define Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Define Adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(listaPost);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){
        Post p = new Post("Albert Einstein","#tbt Viagem legal!",R.drawable.imagem1);
        this.listaPost.add(p);

        p = new Post("Neils Bohr","#tbt legal!",R.drawable.imagem2);
        this.listaPost.add(p);

        p = new Post("Isaac Newton","#tbt Super!",R.drawable.imagem3);
        this.listaPost.add(p);

        p = new Post("Julio Verne",";)",R.drawable.imagem4);
        this.listaPost.add(p);
    }
}
