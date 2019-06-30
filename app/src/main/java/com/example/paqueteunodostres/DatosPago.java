package com.example.paqueteunodostres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DatosPago extends AppCompatActivity {
TextView Nombrepago,Subclase,Monto;
EditText numsubclase,montoclase;
Button button;
public static double total = 0;
public static double getTotal(){
    return total;
}

    boolean[] paquete= MainActivity.getPaquete();
    int[] numpaquete= MainActivity.getnumPaquete();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_pago);
        Nombrepago = (TextView)findViewById(R.id.nombrepago);
        Subclase = (TextView)findViewById(R.id.subclase);
        numsubclase = (EditText)findViewById(R.id.numsubclase);
        Monto = (TextView)findViewById(R.id.monto);
        button = (Button)findViewById(R.id.siguienteclase);
        opcion();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcion();
            }
        });

    }
    protected void opcion(){
        montoclase = (EditText)findViewById(R.id.montoclase);

        if(montoclase.getText().toString()!=""){
            total+=Double.parseDouble(montoclase.getText().toString());
        }
        montoclase.setText("");
        montoclase.setHint("0.00");

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter;
        numsubclase.setText("");
        int i=0;
        while(paquete[i]==false){
            i++;
            if(i==11){

                Intent j = new Intent(this ,pago.class );
                startActivity(j);
                break;
            }
        }
        switch (i) {
            case 0:
                Nombrepago.setText("Recarga Celular");
                adapter = ArrayAdapter.createFromResource(this,
                        R.array.Telefonia, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
                Subclase.setText("Número de celular (10 dígitos)");
                Monto.setText("Monto de Recarga");

                if(numpaquete[i]<=1){

                    paquete[i] = false;
                    montoclase.setText("");
                }else{
                    numpaquete[i]-=1;

                }
                break;
            case 1:
                Nombrepago.setText("Boletos de Cine");
                adapter = ArrayAdapter.createFromResource(this,
                        R.array.Cines, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
                Subclase.setText("Tipo de boleto");
                Monto.setText("Cantidad de Boletos");
                if(numpaquete[i]<=1){

                    paquete[i] = false;
                }else{
                    numpaquete[i]-=1;

                }
                break;
            case 2:
                Nombrepago.setText("Recarga Tag");
                adapter = ArrayAdapter.createFromResource(this,
                        R.array.OperadorTag, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
                Subclase.setText("Numero de Tag");
                Monto.setText("Monto de Recarga");
                if(numpaquete[i]<=1){

                    paquete[i] = false;
                }else{
                    numpaquete[i]-=1;

                }
                break;
            case 3:
                Nombrepago.setText("Pago de Luz");
                adapter = ArrayAdapter.createFromResource(this,
                        R.array.Luz, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
                Subclase.setText("Numero de Servicio");
                Monto.setText("Monto de Pago");
                if(numpaquete[i]<=1){

                    paquete[i] = false;
                }else{
                    numpaquete[i]-=1;

                }
                break;
            case 4:
                Nombrepago.setText("Pago de Teléfono");
                adapter = ArrayAdapter.createFromResource(this,
                        R.array.Telefono, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
                Subclase.setText("Numero de Servicio");
                Monto.setText("Monto de Pago");
                if(numpaquete[i]<=1){

                    paquete[i] = false;
                }else{
                    numpaquete[i]-=1;

                }
                break;
            case 5:
                Nombrepago.setText("Pago de Televisión");
                adapter = ArrayAdapter.createFromResource(this,
                        R.array.TV, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
                Subclase.setText("Numero de Servicio");
                Monto.setText("Monto de Pago");
                if(numpaquete[i]<=1){

                    paquete[i] = false;
                }else{
                    numpaquete[i]-=1;

                }
                break;
            case 6:
                Nombrepago.setText("Plan Celular");
                adapter = ArrayAdapter.createFromResource(this,
                        R.array.planCel, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
                Subclase.setText("Numero de Servicio");
                Monto.setText("Monto de Pago");
                if(numpaquete[i]<=1){

                    paquete[i] = false;
                }else{
                    numpaquete[i]-=1;

                }
                break;
            case 7:
                Nombrepago.setText("Pago de Agua");
                adapter = ArrayAdapter.createFromResource(this,
                        R.array.Agus, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
                Subclase.setText("Numero de Servicio");
                Monto.setText("Monto de Pago");
                if(numpaquete[i]<=1){

                    paquete[i] = false;
                }else{
                    numpaquete[i]-=1;

                }
                break;
            case 8:
                Nombrepago.setText("Pago de Gas");
                adapter = ArrayAdapter.createFromResource(this,
                        R.array.Gas, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
                Subclase.setText("Numero de Servicio");
                Monto.setText("Monto de Pago");
                if(numpaquete[i]<=1){

                    paquete[i] = false;
                }else{
                    numpaquete[i]-=1;

                }
                break;
            case 9:
                Nombrepago.setText("Pago de Infonavit");
                adapter = ArrayAdapter.createFromResource(this,
                        R.array.Infonavit, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
                Subclase.setText("Numero de Servicio");
                Monto.setText("Monto de Pago");
                if(numpaquete[i]<=1){

                    paquete[i] = false;
                }else{
                    numpaquete[i]-=1;

                }
                break;
            case 10:
                Nombrepago.setText("Pago de Diversión");
                adapter = ArrayAdapter.createFromResource(this,
                        R.array.Diversion, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
                Subclase.setText("No aplica");
                Monto.setText("Monto de Pago");
                if(numpaquete[i]<=1){

                    paquete[i] = false;
                }else{
                    numpaquete[i]-=1;

                }
                break;

        }
        Toast.makeText(this,Double.toString(total),Toast.LENGTH_SHORT).show();

    }
}
