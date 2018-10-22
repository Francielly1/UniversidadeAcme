package com.example.a17170086.universidadeacme;

import com.example.a17170086.universidadeacme.model.Boletim;
import com.example.a17170086.universidadeacme.view.BoletimView;

import java.util.ArrayList;
import java.util.List;

public class BoletimPresenter {

    BoletimView boletimView;

    public BoletimPresenter(BoletimView boletimView /*NoticiaService service*/){
        this.boletimView = boletimView;
        //this.service = service;
    }

    public void carregarBoletim(){

        //chamada ao endpoint que retorna todos livros
      /*  Call<List<Book>> call = service.getBooks();

        call.enqueue(new Callback<List<Book>>() {
            @Override
            public void onResponse(Call<List<Book>> call, Response<List<Book>> response) {
                //chamada deu certo

                //Pegando o retorno do servidor
                List<Book> retornoApi = response.body();

                mainView.exibirLivros(retornoApi);

            }

            @Override
            public void onFailure(Call<List<Book>> call, Throwable t) {
                //deu algum erro
                mainView.exibirMensagem("Erro de rede");
            }
        });*/


        List<Boletim> lst = new ArrayList<>();

        //criar evento fake
        Boletim boletim = new Boletim(0, "Programação Mobile", 8, 15, "Primeiro Semestre");
        Boletim boletim1 = new Boletim(0, "Programação Programação", 6, 20, "Primeiro Semestre");

        //Mensalidade men = new Mensalidade();
        //men.setMensalidade(men);

        lst.add(boletim);
        lst.add(boletim1);

        //criar evento fake
        //Evento ev = new Evento(0,"Feira de Tecnologia", "Os três maiores desafios que as médias empresas brasileiras enfrentam e como superá-los. Os três maiores desafios que as médias empresas brasileiras enfrentam e como superá-los.", "18h", "Universidade ACME - Rua Dom Pedro I, 130 - SP", "30 de Novembro de 2018", "https://hp.imguol.com.br/c/home/e9/2018/09/04/ryan-gosling-em-cena-de-first-man-1536076880027_300x168.jpg");

        /*NoticiaEvento nv1 = new NoticiaEvento();
        nv1.setEvento(ev);
        lst.add(nv1);*/

        // lst.add(new Noticia(0,"Titulo Notícia 1", "teste noticia 1"));
        //  lst.add(new Noticia(0,"Titulo Notícia 2", " teste noticia 2"));

        boletimView.exibirBoletim(lst);

    }
}
