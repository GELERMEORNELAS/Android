package com.example.vostro.android_app_permuta.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vostro.android_app_permuta.R;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CozinhaFragment extends Fragment {


    Button btnLigarLampada;
    Button btnDesligarLampada;

    int id = 0;

    View view;

    public CozinhaFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_cozinha, container, false);
        btnLigarLampada = view.findViewById(R.id.btnLigarLampada);
        btnDesligarLampada = view.findViewById(R.id.btnDesligarLampada);

        final ImageView lampadaAcesa;
        final ImageView lampadaApagada;

        lampadaAcesa = (ImageView)view.findViewById(R.id.lampada_acesa);
        lampadaApagada = (ImageView)view.findViewById(R.id.lampada_apagada);

        btnLigarLampada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lampadaAcesa.setVisibility(View.VISIBLE);
                lampadaApagada.setVisibility(View.INVISIBLE);

            }
        });

        btnDesligarLampada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lampadaApagada.setVisibility(View.VISIBLE);
                lampadaAcesa.setVisibility(View.INVISIBLE);

            }
        });
        return view;
    }



}


