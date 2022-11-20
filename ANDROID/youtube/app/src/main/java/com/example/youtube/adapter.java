package com.example.youtube;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class adapter extends ArrayAdapter<usuarios> {

    Context context;
    List<usuarios> arrayusuarios;


    public adapter(@NonNull Context context, List<usuarios>arrayusuarios) {

        super(context, R.layout.list_usuarios,arrayusuarios);
        this.context=context;
        this.arrayusuarios =arrayusuarios;
    }//adapter nonnull

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_usuarios,null, true);
        TextView txtid=view.findViewById(R.id.txtid);
        TextView txtnombre=view.findViewById(R.id.txtnombre);
        txtid.setText(arrayusuarios.get(position).getId());
        return view;
    }//getview
}//classs
