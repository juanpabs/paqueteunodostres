package com.example.paqueteunodostres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class pago extends AppCompatActivity {
TextView total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);
        total = (TextView)findViewById(R.id.total);
        total.setText(Double.toString(DatosPago.getTotal()));
    }
}
