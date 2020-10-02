package com.examen.calculaletradni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private char[] tablaLetraDni =
            new char[]{'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    private TextView numDNI;
    private TextView letraDNI;
    private TextView labelInfo;
    private TextView dniCompleto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numDNI = findViewById(R.id.numeroDNI);
        letraDNI = findViewById(R.id.letraDNI);
        labelInfo = findViewById(R.id.labelInfo);
        dniCompleto = findViewById(R.id.resultDNI);
        Button calcula = findViewById(R.id.btnCalcular);
        calcula.setOnClickListener(this);
        Button salir = findViewById(R.id.btnSalir);
        salir.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCalcular:
                // int num1 = Integer.parseInt(numero1.getText().toString());
                int dni = Integer.parseInt(numDNI.getText().toString());
                int resto = dni % 23;
                String dniStr = numDNI.getText().toString();
                labelInfo.setVisibility(View.VISIBLE);
                letraDNI.setText(String.valueOf(tablaLetraDni[resto]));
                dniStr = dniStr.concat(String.valueOf(tablaLetraDni[resto]));
                dniCompleto.setText(dniStr);
                break;
            case R.id.btnSalir:
                finish();
                break;
        }
    }
}