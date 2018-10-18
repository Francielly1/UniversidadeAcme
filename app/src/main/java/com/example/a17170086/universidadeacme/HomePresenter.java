package com.example.a17170086.universidadeacme;

import com.example.a17170086.universidadeacme.model.Evento;
import com.example.a17170086.universidadeacme.model.Noticia;
import com.example.a17170086.universidadeacme.model.NoticiaEvento;
import com.example.a17170086.universidadeacme.view.HomeView;

import java.util.ArrayList;
import java.util.List;

public class HomePresenter {

    HomeView homeView;
    //NoticiaService service;

    public HomePresenter(HomeView homeView /*NoticiaService service*/){
        this.homeView = homeView;
        //this.service = service;
    }

    public void onNoticiaClick(Noticia noticia){
        //homeView.exibirMensagem(noticia.getTitulo());
    }


    public void carregarNoticia(){

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


        List<NoticiaEvento> lst = new ArrayList<>();

        //criar evento fake
        Noticia noticia = new Noticia(0,"Empresários bancam campanha contra o PT pelo WhatsApp", "Com contratos de R$ 12 milhões, prática viola a lei por ser doação não declarada.", "Os três maiores desafios que as médias empresas brasileiras enfrentam e como superá-los. Os três maiores desafios que as médias empresas brasileiras enfrentam e como superá-los.", "https://images.immedia.com.br//31/31627_2_SM.jpg" );

        NoticiaEvento nv = new NoticiaEvento();
        nv.setNoticia(noticia);

        lst.add(nv);

        //criar evento fake
        Evento ev = new Evento(0,"Feira de Tecnologia", "Os três maiores desafios que as médias empresas brasileiras enfrentam e como superá-los. Os três maiores desafios que as médias empresas brasileiras enfrentam e como superá-los.", "18h", "Universidade ACME - Rua Dom Pedro I, 130 - SP", "30 de Novembro de 2018", "https://hp.imguol.com.br/c/home/e9/2018/09/04/ryan-gosling-em-cena-de-first-man-1536076880027_300x168.jpg");

        NoticiaEvento nv1 = new NoticiaEvento();
        nv1.setEvento(ev);
        lst.add(nv1);

       // lst.add(new Noticia(0,"Titulo Notícia 1", "teste noticia 1"));
      //  lst.add(new Noticia(0,"Titulo Notícia 2", " teste noticia 2"));

        homeView.exibirNoticias(lst);

    }


}
