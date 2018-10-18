package com.example.a17170086.universidadeacme.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a17170086.universidadeacme.R;
import com.example.a17170086.universidadeacme.model.NoticiaEvento;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NoticiaAdapter extends ArrayAdapter<NoticiaEvento> {

    public NoticiaAdapter(Context ctx){
        super(ctx, 0, new ArrayList<NoticiaEvento>());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        if(v == null){
            v = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_view_item_noticia, parent, false);
        }

        TextView txtTitulo = v.findViewById(R.id.txt_item_titulo_noticia);
        TextView txtSubtitulo = v.findViewById(R.id.txt_item_subtitulo_noticia);
        //TextView txtDescricao = v.findViewById(R.id.txt_item_texto_noticia);
        ImageView img_item_noticia = v.findViewById(R.id.img_item_noticia);
        ImageView icon_local = v.findViewById(R.id.icon_local);


        NoticiaEvento noticiaEvento = getItem(position);

        if(noticiaEvento.getNoticia() != null){

            txtTitulo.setText(noticiaEvento.getNoticia().getTitulo());
            txtSubtitulo.setText(noticiaEvento.getNoticia().getSubTitulo());

            Picasso.get().load(noticiaEvento.getNoticia().getImagem()).into(img_item_noticia);
            icon_local.setVisibility(View.GONE);
            txtSubtitulo.setVisibility(View.VISIBLE);

        }else{
            //evento
            icon_local.setVisibility(View.VISIBLE);
            txtSubtitulo.setVisibility(View.GONE);

            Picasso.get().load(noticiaEvento.getEvento().getImagem()).into(img_item_noticia);
            txtTitulo.setText(noticiaEvento.getEvento().getTitulo());
        }


        //txtDescricao.setText(noticia.getDescricao());

        return v;
    }
}
