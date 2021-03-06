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

import com.example.a17170086.universidadeacme.BoletimPresenter;
import com.example.a17170086.universidadeacme.R;
import com.example.a17170086.universidadeacme.adapter.BoletimAdapter;
import com.example.a17170086.universidadeacme.model.Boletim;
import com.example.a17170086.universidadeacme.view.BoletimView;

import java.util.List;

public class BoletimFragment extends Fragment implements AdapterView.OnItemClickListener, BoletimView {

    ListView list_view_boletim;

    BoletimAdapter boletimAdapter;


    //NoticiasService service;
    BoletimPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //carregando o XML para a vaiavel v
        View v = getLayoutInflater().from(getContext()).inflate(R.layout.fragment_boletim, container, false);

        list_view_boletim = v.findViewById(R.id.list_view_boletim);

        //configurando o adapter
        boletimAdapter = new BoletimAdapter(getContext());
        list_view_boletim.setAdapter(boletimAdapter);


        //configurando o click da lista
        list_view_boletim.setOnItemClickListener(this);

        //Configurar o retrofit
        /*Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BooksService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();*/

        //instanciando o serviço
        //service = retrofit.create(NoticiaService.class);

        //instanciando o presenter
        presenter = new BoletimPresenter(this);

        //carregar livros
        presenter.carregarBoletim();

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
    public void exibirBoletim(List<Boletim> boletim) {

        //limpando o listview
        boletimAdapter.clear();

        //adicionando os boletim na tela
        boletimAdapter.addAll(boletim);

    }
}
