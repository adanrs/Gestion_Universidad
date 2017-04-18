package com.GestionUniversitaria.Conector;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.GestionUniversitaria.Inicio;
import com.GestionUniversitaria.R;
import com.GestionUniversitaria.Editar.editar_Matriculador;

import java.util.ArrayList;

import Modelo.Matriculador;



public class conector_Matriculador extends RecyclerView.Adapter<conector_Matriculador.ViewHolder>{


    private static ArrayList<Matriculador> mMatriculadores;
    private static Context mContext;
    private int mExpandedPosition=-1;


    public conector_Matriculador(Context context, ArrayList<Matriculador> matriculadores) {
        mMatriculadores = matriculadores;
        mContext = context;
    }

    private Context getContext() {
        return mContext;
    }



    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nombre;
        public TextView cedula;
        public TextView telefono;
        public TextView email;
        public TextView botonEditar;
        public TextView textoTel;
        public TextView textoEm;
        private Context context;



        public ViewHolder(Context context, View itemView) {
            super(itemView);

            this.context = context;
            nombre = (TextView) itemView.findViewById(R.id.nombreMatriculador);
            cedula = (TextView) itemView.findViewById(R.id.cedulaMatriculador);
            telefono=(TextView) itemView.findViewById(R.id.telefonoMatriculador);
            email=(TextView) itemView.findViewById(R.id.emailMatriculador);
            textoTel=(TextView) itemView.findViewById(R.id.textView7);
            textoEm=(TextView) itemView.findViewById(R.id.textView8);
            botonEditar=(TextView) itemView.findViewById(R.id.botonEditarMatriculador);


            botonEditar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition(); // gets item position
                    if (position != RecyclerView.NO_POSITION) { // Check if an item was deleted, but the user clicked it before the UI removed it
                        Matriculador matriculador = mMatriculadores.get(position);


                        Fragment newFragment=new editar_Matriculador().newInstance(matriculador);
                        if(mContext instanceof Inicio){
                            FragmentTransaction fragmentTransaction=((Inicio) mContext).getSupportFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.frament_container, newFragment).addToBackStack("listaMatriculadores").commit();

                        }

                    }
                }
            });

        }


    }





    @Override
    public conector_Matriculador.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.lista_matriculador, parent, false);

        conector_Matriculador.ViewHolder viewHolder = new conector_Matriculador.ViewHolder(context,contactView);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(final conector_Matriculador.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        Matriculador matriculador = null;
        matriculador = (Matriculador) mMatriculadores.get(position);

        final int p=position;
        // Set item views based on your views and data model
        TextView codigo = viewHolder.cedula;
        codigo.setText(matriculador.getCedula());
        TextView nombre = viewHolder.nombre;
        nombre.setText(matriculador.getNombre());
        TextView telefono = viewHolder.telefono;
        telefono.setText(matriculador.getTelefono());
        TextView email = viewHolder.email;
        email.setText(matriculador.getEmail());

        final boolean isExpanded = position== mExpandedPosition;
        viewHolder.telefono.setVisibility(isExpanded?View.VISIBLE:View.GONE);
        viewHolder.email.setVisibility(isExpanded?View.VISIBLE:View.GONE);
        viewHolder.botonEditar.setVisibility(isExpanded?View.VISIBLE:View.GONE);
        viewHolder.textoTel.setVisibility(isExpanded?View.VISIBLE:View.GONE);
        viewHolder.textoEm.setVisibility(isExpanded?View.VISIBLE:View.GONE);
        viewHolder.itemView.setActivated(isExpanded);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExpandedPosition = isExpanded ? -1:p;
                TransitionManager.beginDelayedTransition((ViewGroup)v);
                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mMatriculadores.size();
    }










}

