package com.example.a17170086.universidadeacme.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a17170086.universidadeacme.R;
import com.example.a17170086.universidadeacme.model.Noticia;

public class ItemNoticiaFragment extends Fragment {

    Noticia noticia;
    TextView txt_titulo_item, txt_descricao_item, txt_subtitulo_item;
    ImageView img_item;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //carregando o XML para a vaiavel v
        View v = LayoutInflater.from(getContext()).inflate(R.layout.fragment_item_noticia, container, false);

        txt_titulo_item = v.findViewById(R.id.txt_titulo_item);
        txt_descricao_item = v.findViewById(R.id.txt_descricao_item);
        img_item = v.findViewById(R.id.img_item);
        txt_subtitulo_item = v.findViewById(R.id.txt_subtitulo_item);

        txt_titulo_item.setText(noticia.getTitulo());
        txt_descricao_item.setText(noticia.getDescricao());
        txt_subtitulo_item.setText(noticia.getSubTitulo());



        //Toast.makeText(getContext(), noticia.getTitulo(), Toast.LENGTH_LONG).show();

        return v;
    }
}
