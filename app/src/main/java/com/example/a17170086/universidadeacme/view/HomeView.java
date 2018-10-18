package com.example.a17170086.universidadeacme.view;

import com.example.a17170086.universidadeacme.model.NoticiaEvento;

import java.util.List;

public interface HomeView {

     void exibirNoticias (List<NoticiaEvento> noticias);
     void exibirMensagem(String msg);
}
