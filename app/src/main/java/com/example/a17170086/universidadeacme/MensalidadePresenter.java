package com.example.a17170086.universidadeacme;

import com.example.a17170086.universidadeacme.model.Mensalidade;
import com.example.a17170086.universidadeacme.view.MensalidadeView;

import java.util.ArrayList;
import java.util.List;

public class MensalidadePresenter {

    MensalidadeView mensalidadeView;

    public MensalidadePresenter(MensalidadeView mensalidadeView /*NoticiaService service*/){
        this.mensalidadeView = mensalidadeView;
        //this.service = service;
    }

    public void carregarMensalidade(){

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


        List<Mensalidade> lst = new ArrayList<>();

        //criar evento fake
        Mensalidade mensalidade = new Mensalidade(0, "Janeiro", "R$ 1500,00", "15/01/2018", "Paga");
        Mensalidade mensalidade2 = new Mensalidade(0, "Fevereiro", "R$ 1500,00", "15/02/2018", "Pendente");

        //Mensalidade men = new Mensalidade();
        //men.setMensalidade(men);

        lst.add(mensalidade);
        lst.add(mensalidade2);

        //criar evento fake
        //Evento ev = new Evento(0,"Feira de Tecnologia", "Os três maiores desafios que as médias empresas brasileiras enfrentam e como superá-los. Os três maiores desafios que as médias empresas brasileiras enfrentam e como superá-los.", "18h", "Universidade ACME - Rua Dom Pedro I, 130 - SP", "30 de Novembro de 2018", "https://hp.imguol.com.br/c/home/e9/2018/09/04/ryan-gosling-em-cena-de-first-man-1536076880027_300x168.jpg");

        /*NoticiaEvento nv1 = new NoticiaEvento();
        nv1.setEvento(ev);
        lst.add(nv1);*/

        // lst.add(new Noticia(0,"Titulo Notícia 1", "teste noticia 1"));
        //  lst.add(new Noticia(0,"Titulo Notícia 2", " teste noticia 2"));

        mensalidadeView.exibirMensalidades(lst);

    }
}
