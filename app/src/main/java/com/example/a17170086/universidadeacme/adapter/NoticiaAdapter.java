package com.example.a17170086.universidadeacme.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.a17170086.universidadeacme.R;
import com.example.a17170086.universidadeacme.model.NoticiaEvento;

import java.util.ArrayList;

public class NoticiaAdapter extends ArrayAdapter<NoticiaEvento> {

    public NoticiaAdapter(Context ctx){
        super(ctx, 0, new ArrayList<NoticiaEvento>());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        NoticiaEvento noticiaEvento = getItem(position);

        ViewHolder viewHolder;

        View v = convertView;


        if(noticiaEvento.getNoticia() != null){

            if(v == null){
                v = LayoutInflater.from(getContext())
                        .inflate(R.layout.list_view_item_noticia, parent, false);

                viewHolder = new ViewHolder();
                viewHolder.setHolderNoticia(v);
                v.setTag(viewHolder);

            }else {
                viewHolder = (ViewHolder) v.getTag();
            }

        }else{

            if(v == null){
                v = LayoutInflater.from(getContext())
                        .inflate(R.layout.list_view_item_evento, parent, false);

                viewHolder = new ViewHolder();
                viewHolder.setHolderEvento(v);

                v.setTag(viewHolder);

            }else {
                viewHolder = (ViewHolder) v.getTag();
            }

        }





        /*

        TextView txtTitulo = v.findViewById(R.id.txt_item_titulo_noticia);
        TextView txtSubtitulo = v.findViewById(R.id.txt_item_subtitulo_noticia);
        //TextView txtDescricao = v.findViewById(R.id.txt_item_texto_noticia);
        ImageView img_item_noticia = v.findViewById(R.id.img_item_noticia);
        ImageView icon_local = v.findViewById(R.id.icon_local);
        */


        if(noticiaEvento.getNoticia() != null){

            viewHolder.holderNoticia.txtTitulo.setText(noticiaEvento.getNoticia().getTitulo());
            viewHolder.holderNoticia.txtSubtitulo.setText(noticiaEvento.getNoticia().getSubTitulo());

            /*
            Picasso.get().load(noticiaEvento.getNoticia().getImagem()).into(img_item_noticia);
            icon_local.setVisibility(View.GONE);
            txtSubtitulo.setVisibility(View.VISIBLE);
            */
        }else{
            //evento
            /*
            icon_local.setVisibility(View.VISIBLE);
            txtSubtitulo.setVisibility(View.GONE);

            Picasso.get().load(noticiaEvento.getEvento().getImagem()).into(img_item_noticia);
            */
     //       viewHolder.holderEvento.txtTitulo.setText(noticiaEvento.getEvento().getTitulo());
        }


        //txtDescricao.setText(noticia.getDescricao());

        return v;
    }


    class ViewHolder{
        ViewHolderEvento holderEvento;
        ViewHolderNoticia holderNoticia;

        public void setHolderNoticia(View v){
            holderNoticia = new ViewHolderNoticia(v);
        }
        public void setHolderEvento(View v){
            holderEvento =new ViewHolderEvento(v);
        }
    }

    class ViewHolderEvento{

       public TextView txtTitulo;
       // TextView txtDescricao;

        public ViewHolderEvento(View v) {

            txtTitulo = v.findViewById(R.id.txt_titulo_evento);
           // txtDescricao = v.findViewById(R.id.txt_item_texto_noticia);
        }

    }

    class ViewHolderNoticia{
        public TextView txtTitulo;
        public TextView txtSubtitulo;

            public ViewHolderNoticia(View v) {
                txtTitulo = v.findViewById(R.id.txt_item_titulo_noticia);
                txtSubtitulo = v.findViewById(R.id.txt_item_subtitulo_noticia);
            }
        }


}


