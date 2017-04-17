package com.GestionUniversitaria.Editar;


import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.GestionUniversitaria.R;
import com.GestionUniversitaria.Variables;
import com.GestionUniversitaria.Async;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import Logica.Carrera;
import Logica.Estudiante;


public class editar_Estudiante extends Fragment {

    Estudiante estudiante;
    ArrayList<Carrera> mCarreras;
    String urlRequest;
    String result;
    Calendar myCalendar = Calendar.getInstance();
    TextView fechaNa;

    public editar_Estudiante() {
        // Required empty public constructor
    }

    public static editar_Estudiante newInstance(Estudiante prof, ArrayList<Carrera> carreras){
        editar_Estudiante newFragment=new editar_Estudiante();
        newFragment.setmCarreras(carreras);
        newFragment.setEstudiante(prof);
        return newFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_editar_estudiante, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        final TextView cedula=(TextView) view.findViewById(R.id.cedulaEstudiante);
        final EditText nombre = (EditText) view.findViewById(R.id.nombreEstudiante);
        final EditText telefono = (EditText) view.findViewById(R.id.telefonoEstudiante);
        final EditText email = (EditText) view.findViewById(R.id.emailEstudiante);
        final EditText carrera = (EditText) view.findViewById(R.id.carreraEstudiante);
        fechaNa = (TextView) view.findViewById(R.id.fechaNacEstudiante);
        final EditText pass = (EditText) view.findViewById(R.id.contrasenaEstudiante);
        Button botonGuardar=(Button) view.findViewById(R.id.botonGuardarEstudiante);

        cedula.setText(estudiante.getCedula());
        nombre.setText(estudiante.getNombre());
        telefono.setText(estudiante.getTelefono());
        email.setText(estudiante.getEmail());
        carrera.setText(estudiante.getCarrera().getNombre());
        java.util.Date fe=estudiante.getFechaNac().getTime();
        fechaNa.setText(fe.getDay()+"/"+fe.getMonth()+"/"+(fe.getYear()+1900));
        pass.setText(estudiante.getUsuario().getClave());


        fechaNa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(getActivity(), date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        ArrayList<String> nombresCarreras=new ArrayList<>();
        for (int i=0;i<mCarreras.size();i++)
            nombresCarreras.add(mCarreras.get(i).getNombre());

        final ArrayAdapter<String> spinner_carreras = new  ArrayAdapter<String>(view.getContext(),android.R.layout.simple_spinner_dropdown_item, nombresCarreras);

        carrera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(v.getContext())
                        .setTitle("Elija la carreras")
                        .setAdapter(spinner_carreras, new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int which) {
                                carrera.setText(mCarreras.get(which).getNombre());
                                estudiante.setCarrera(mCarreras.get(which));
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(v.getContext().INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(pass.getWindowToken(), 0);

                final View vi=v;
                AlertDialog.Builder alert = new AlertDialog.Builder(v.getContext());
                alert.setTitle("Confirmacion");
                alert.setMessage("Desea editar este estudiante?");
                alert.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        //reiniciar los errores
                        cedula.setError(null);
                        nombre.setError(null);
                        telefono.setError(null);
                        email.setError(null);
                        carrera.setError(null);
                        fechaNa.setError(null);
                        pass.setError(null);
                        String ced=cedula.getText().toString();
                        String nom=nombre.getText().toString();
                        String tel=telefono.getText().toString();
                        String ema=email.getText().toString();
                        String car=carrera.getText().toString();
                        String fec=fechaNa.getText().toString();
                        String con=pass.getText().toString();

                        boolean cancel=false;
                        View focusView=null;

                        if(TextUtils.isEmpty(ced)){
                            cedula.setError("Cedula Vacio");
                            focusView=cedula;
                            cancel=true;
                        }

                        if(TextUtils.isEmpty(nom)){
                            nombre.setError("Nombre Vacio");
                            focusView=nombre;
                            cancel=true;
                        }

                        if(TextUtils.isEmpty(tel)){
                            telefono.setError("Telefono Vacio");
                            focusView=telefono;
                            cancel=true;
                        }
                        if(TextUtils.isEmpty(ema)){
                            email.setError("Email Vacio");
                            focusView=email;
                            cancel=true;
                        }
                        if(TextUtils.isEmpty(car)){
                            carrera.setError("Carrera Vacio");
                            focusView=carrera;
                            cancel=true;
                        }
                        if(TextUtils.isEmpty(fec)){
                            fechaNa.setError("Fecha Vacia");
                            focusView=fechaNa;
                            cancel=true;
                        }
                        if(TextUtils.isEmpty(con)){
                            pass.setError("Contraseña Vacio");
                            focusView=pass;
                            cancel=true;
                        }


                        if (cancel) {
                            focusView.requestFocus();
                        } else {
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                            String urlBase = Variables.getURLBase();
                            urlRequest = urlBase + "action=EditarEstudiante"+"&cedula="+ced+"&nombre="+nom+"&telefono="+tel+"&email="+ema+"&password="+con+"&fechaNac="+sdf.format(estudiante.getFechaNac().getTime())+"&idCarrera="+estudiante.getCarrera().getCodigo();
                            new Async(vi.getContext(),getFragmentManager(),urlRequest).execute();
                        }

                    }
                });
                alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Canceled.
                    }
                });
                alert.show();


            }
        });

    }


    private void updateLabel() {

        String myFormat = "dd/MM/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        fechaNa.setText(sdf.format(myCalendar.getTime()));
        estudiante.setFechaNac(myCalendar);
    }


    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            // TODO Auto-generated method stub
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateLabel();
        }

    };




    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setmCarreras(ArrayList<Carrera> mCarreras) {
        this.mCarreras = mCarreras;
    }
}
