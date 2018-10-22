package com.example.a17170086.universidadeacme.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.a17170086.universidadeacme.MensalidadePresenter;
import com.example.a17170086.universidadeacme.R;
import com.example.a17170086.universidadeacme.adapter.MensalidadeAdapter;
import com.example.a17170086.universidadeacme.model.Mensalidade;
import com.example.a17170086.universidadeacme.view.MensalidadeView;

import java.util.List;

public class FinanceiroFragment extends Fragment implements AdapterView.OnItemClickListener, MensalidadeView{

    ListView list_view_mensalidade;

    MensalidadeAdapter mensalidadeAdapter;


    //NoticiasService service;
    MensalidadePresenter presenter;

    //MainFragmentContract mainActivity;

    //public void configDependencias(MainFragmentContract mainActivity){
        //this.mainActivity = mainActivity;
    //}



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //carregando o XML para a vaiavel v
        View v = LayoutInflater.from(getContext()).inflate(R.layout.fragment_financeiro, container, false);

        list_view_mensalidade = v.findViewById(R.id.list_view_mensalidade);


        //configurando o adapter
        mensalidadeAdapter = new MensalidadeAdapter(getContext());
        list_view_mensalidade.setAdapter(mensalidadeAdapter);


        //configurando o click da lista
        list_view_mensalidade.setOnItemClickListener(this);

        //Configurar o retrofit
        /*Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BooksService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();*/

        //instanciando o serviço
        //service = retrofit.create(NoticiaService.class);

        //instanciando o presenter
        presenter = new MensalidadePresenter(this);

        //carregar livros
        presenter.carregarMensalidade();

        //presenter = new HomePresenter(this);


        //list_view_eventos = v.findViewById(R.id.list_view_eventos);

        //txt_teste = v.findViewById(R.id.txt_teste);
        //btn_click = v.findViewById(R.id.btn_click);

        // btn_click.setOnClickListener(click);

        //btn_click.setOnClickListener(this);

        return v;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void exibirMensalidades(List<Mensalidade> mensalidades) {
        //limpando o listview
        mensalidadeAdapter.clear();

        //adicionando as mesalidades na tela
        mensalidadeAdapter.addAll(mensalidades);
    }
}
