package com.example.juancarlos.intterfas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class juancarlosalvarezMainActivity extends AppCompatActivity{ //implements View.OnClickListener{


    EditText pPrimer, pSegund, pTotal, eLoggin, ePassword, eRepPassword, eCorreo;
    Button pCalcu, bFecha, bAceptar;
    RadioButton pSuma, pResta, pMulti, pDivi;
    DatePicker datePicker;
    TextView textViewFecha;
    Spinner spinner;
    CheckBox eMusica, eCine, eLiteratura, eMatematicas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aplica3);


        pPrimer = (EditText) findViewById(R.id.pPrimer);
        pSegund = (EditText) findViewById(R.id.pSegund);
        pCalcu = (Button) findViewById(R.id.pCalcu);
        pSuma = (RadioButton) findViewById(R.id.pSuma);
        pResta = (RadioButton) findViewById(R.id.pResta);
        pMulti = (RadioButton) findViewById(R.id.pMulti);
        pDivi = (RadioButton) findViewById(R.id.pDivi);
        pTotal= (EditText) findViewById(R.id.pTotal);
        datePicker = (DatePicker) findViewById(R.id.eDate);
        textViewFecha = (TextView)findViewById(R.id.eFechaNac);
        bFecha = (Button) findViewById(R.id.bEnviarFecha);
        /*spinner = (Spinner) findViewById(R.id.eSpinner);
        List list = new ArrayList();
        list.add("Medellin");
        list.add("Bogota");
        list.add("Envigado");
        list.add("Bello");
        list.add("Cali");
        list.add("Barranquilla");
        list.add("Cartagena");
        list.add("Guarne");
        list.add("Leticia");
        list.add("Rioacha");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(juancarlosalvarezMainActivity.this, "Ciudad " + String.valueOf(spinner.getSelectedItem()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        pSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Total;

                Total = Double.parseDouble(pPrimer.getText().toString()) +
                        Double.parseDouble(pSegund.getText().toString());


                pTotal.setText(String.valueOf(Total));
            }
        });

        pResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Total;

                Total = Double.parseDouble(pPrimer.getText().toString()) -
                        Double.parseDouble(pSegund.getText().toString());


                pTotal.setText(String.valueOf(Total));
            }
        });

        pMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Total;

                Total = Double.parseDouble(pPrimer.getText().toString()) *
                        Double.parseDouble(pSegund.getText().toString());


                pTotal.setText(String.valueOf(Total));
            }
        });

        pDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Total;

                Total = Double.parseDouble(pPrimer.getText().toString()) /
                        Double.parseDouble(pSegund.getText().toString());


                pTotal.setText(String.valueOf(Total));
            }
        });


       /*eLoggin= (EditText) findViewById(R.id.eLoggin);
        ePassword= (EditText) findViewById(R.id.ePassword);
        eRepPassword= (EditText) findViewById(R.id.eRepPassword);
        eCorreo= (EditText) findViewById(R.id.eCorreo);



        bFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewFecha.setText(String.valueOf(datePicker.getDayOfMonth() + "-" +
                                        String.valueOf(datePicker.getMonth() + "-" +
                                                        String.valueOf(datePicker.getYear())
                                        )
                        )
                );
            }
        });


        eMusica = (CheckBox) findViewById(R.id.eMusica);
        eCine = (CheckBox) findViewById(R.id.eCine);
        eLiteratura = (CheckBox) findViewById(R.id.eLiteratura);
        eMatematicas = (CheckBox) findViewById(R.id.eMatematicas);


        bAceptar = (Button) findViewById(R.id.bAceptar);
        bAceptar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        StringBuffer result = new StringBuffer();
        result.append(" Musica ").append((eMusica.isChecked()));
        result.append(" Cine ").append((eCine.isChecked()));
        result.append(" Literatura ").append((eLiteratura.isChecked()));
        result.append(" Matematicas ").append((eMatematicas.isChecked()));


        Toast.makeText(juancarlosalvarezMainActivity.this, result.toString(),Toast.LENGTH_SHORT).show();*/

    }
}
