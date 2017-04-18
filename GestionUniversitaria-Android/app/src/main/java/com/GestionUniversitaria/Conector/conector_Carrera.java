package com.GestionUniversitaria.Conector;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.GestionUniversitaria.Inicio;
import com.GestionUniversitaria.R;
import com.GestionUniversitaria.Editar.editar_Carrera;

import java.util.ArrayList;

import Modelo.Carrera;


public class conector_Carrera extends RecyclerView.Adapter<conector_Carrera.ViewHolder> {

    private static ArrayList<Carrera> mCarreras;
    private static Context mContext;


    public class AdapterItem{

    }


    public conector_Carrera(Context context, ArrayList<Carrera> carreras) {
        mCarreras = carreras;
        mContext = context;
    }

    private Context getContext() {
        return mContext;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nombre;
        public TextView codigo;
        public TextView titulo;
        public TextView botonEditar;
        private Context context;



        public ViewHolder(Context context, View itemView) {
            super(itemView);

            this.context = context;
            nombre = (TextView) itemView.findViewById(R.id.nombreCarrera);
            codigo = (TextView) itemView.findViewById(R.id.codigoCarrera);
            titulo = (TextView) itemView.findViewById(R.id.tituloCarrera);
            botonEditar=(TextView) itemView.findViewById(R.id.botonEditarCarrera);


            botonEditar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition(); // gets item position
                    if (position != RecyclerView.NO_POSITION) { // Check if an item was deleted, but the user clicked it before the UI removed it
                        Carrera carrera = mCarreras.get(position);


                        Fragment newFragment=new editar_Carrera().newInstance(carrera);
                        if(mContext instanceof Inicio){
                            FragmentTransaction fragmentTransaction=((Inicio) mContext).getSupportFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.frament_container, newFragment).addToBackStack("listaCarreras").commit();

                        }

                    }
                }
            });

        }


    }







    @Override
    public conector_Carrera.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.lista_carrera, parent, false);

        conector_Carrera.ViewHolder viewHolder = new conector_Carrera.ViewHolder(context,contactView);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(conector_Carrera.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        Carrera carrera = null;
        carrera = (Carrera) mCarreras.get(position);

        // Set item views based on your views and data model
        TextView codigo = viewHolder.codigo;
        codigo.setText(carrera.getCodigo());
        TextView nombre = viewHolder.nombre;
        nombre.setText(carrera.getNombre());
        TextView titulo = viewHolder.titulo;
        titulo.setText(carrera.getTitulo());

    }

    @Override
    public int getItemCount() {
        return mCarreras.size();
    }


}
