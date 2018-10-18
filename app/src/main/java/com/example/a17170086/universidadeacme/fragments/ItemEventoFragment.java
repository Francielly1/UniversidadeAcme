package com.example.a17170086.universidadeacme.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a17170086.universidadeacme.R;
import com.example.a17170086.universidadeacme.model.Evento;

public class ItemEventoFragment  extends Fragment {

    Evento evento;
    TextView txt_titulo_item, txt_descricao_item, txt_data_evento, txt_horario_evento, txt_local_evento;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //carregando o XML para a vaiavel v
        View v = LayoutInflater.from(getContext()).inflate(R.layout.fragment_item_evento, container, false);

        txt_titulo_item = v.findViewById(R.id.txt_titulo_item);
        txt_descricao_item = v.findViewById(R.id.txt_descricao_item);
        txt_data_evento = v.findViewById(R.id.txt_data_evento);
        txt_horario_evento = v.findViewById(R.id.txt_horario_evento);
        txt_local_evento = v.findViewById(R.id.txt_local_evento);

        txt_titulo_item.setText(evento.getTitulo());
        txt_descricao_item.setText(evento.getDescricao());
        txt_data_evento.setText(evento.getData());
        txt_horario_evento.setText(evento.getHorario());
        txt_local_evento.setText(evento.getLocal());

        //Toast.makeText(getContext(), noticia.getTitulo(), Toast.LENGTH_LONG).show();
        return v;
    }
}
