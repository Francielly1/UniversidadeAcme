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
import com.example.a17170086.universidadeacme.model.Mensalidade;

import java.util.ArrayList;

public class MensalidadeAdapter extends ArrayAdapter<Mensalidade> {

    public MensalidadeAdapter(Context ctx){
        super(ctx, 0, new ArrayList<Mensalidade>());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        if(v == null){
            v = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_view_item_mensalidade, parent, false);
        }

        TextView txtMes = v.findViewById(R.id.txt_mes);
        TextView txtValor = v.findViewById(R.id.txt_valor);
        TextView txtData = v.findViewById(R.id.txt_data);
        TextView txtStatus = v.findViewById(R.id.txt_status);

        Mensalidade mensalidade = getItem(position);

        txtMes.setText(mensalidade.getMes());
        txtValor.setText(mensalidade.getValor());
        txtData.setText(mensalidade.getVencimento());
        txtStatus.setText(mensalidade.getStatus());


        //txtDescricao.setText(noticia.getDescricao());

        return v;
    }
}
