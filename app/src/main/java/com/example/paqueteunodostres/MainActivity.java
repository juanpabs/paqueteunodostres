package com.example.paqueteunodostres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ver;
    Button button;
CheckBox recargacel,boletoscine,recargatag,pagoCFE,pagoTelefono,pagoTV,plancel,pagoAgua,pagoGas,pagoInfonavit,pagoDiversion;
EditText numrecargacel,numboletoscine,numrecargatag,numpagoCFE,numpagoTelefono,numpagoTV,numplancel,numpagoAgua,numpagoGas,numpagoInfonavit,numPagodiversion;
public static boolean[] paquete = new boolean[11];
public static int[] numpaquete = new int[11];

    public static boolean[] getPaquete() {
        return paquete;
    }
    public static int[] getnumPaquete() {
        return numpaquete;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =(Button)findViewById(R.id.buttonpaquete);
        ver =(TextView)findViewById(R.id.ver);

        recargacel = (CheckBox)findViewById(R.id.chrecargacelular);
        boletoscine = (CheckBox)findViewById(R.id.chboletoscine);
        recargatag = (CheckBox)findViewById(R.id.chrecargatagr);
        pagoCFE = (CheckBox)findViewById(R.id.chpagoCFE);
        pagoTelefono = (CheckBox)findViewById(R.id.chpagotelefono);
        pagoTV = (CheckBox)findViewById(R.id.chTV);
        plancel = (CheckBox)findViewById(R.id.chplancel);
        pagoAgua = (CheckBox)findViewById(R.id.chagua);
        pagoGas = (CheckBox)findViewById(R.id.chgas);
        pagoInfonavit = (CheckBox)findViewById(R.id.chInfonavit);
        pagoDiversion = (CheckBox)findViewById(R.id.chdiversion);

        numrecargacel = (EditText)findViewById(R.id.chrecargacelularnum);
        numboletoscine = (EditText)findViewById(R.id.chboletoscinenum);
        numrecargatag = (EditText)findViewById(R.id.chrecargatagrnum);
        numpagoCFE = (EditText)findViewById(R.id.chpagoCFErnum);
        numpagoTelefono = (EditText)findViewById(R.id.chpagotelefononum);
        numpagoTV = (EditText)findViewById(R.id.chTVnum);
        numplancel = (EditText)findViewById(R.id.chplancelnum);
        numpagoAgua = (EditText)findViewById(R.id.chaguanum);
        numpagoGas = (EditText)findViewById(R.id.chgasnum);
        numpagoInfonavit = (EditText)findViewById(R.id.chInfonavitnum);
        numPagodiversion = (EditText)findViewById(R.id.chdiversionnum);



button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        paquete[0]=recargacel.isChecked();
        paquete[1]=boletoscine.isChecked();
        paquete[2]=recargatag.isChecked();
        paquete[3]=pagoCFE.isChecked();
        paquete[4]=pagoTelefono.isChecked();
        paquete[5]=pagoTV.isChecked();
        paquete[6]=plancel.isChecked();
        paquete[7]=pagoAgua.isChecked();
        paquete[8]=pagoGas.isChecked();
        paquete[9]=pagoInfonavit.isChecked();
        paquete[10]=pagoDiversion.isChecked();

        numpaquete[0] = Integer.parseInt(numrecargacel.getText().toString());
        numpaquete[1] = Integer.parseInt(numboletoscine.getText().toString());
        numpaquete[2] = Integer.parseInt(numrecargatag.getText().toString());
        numpaquete[3] = Integer.parseInt(numpagoCFE.getText().toString());
        numpaquete[4] = Integer.parseInt(numpagoTelefono.getText().toString());
        numpaquete[5] = Integer.parseInt(numpagoTV.getText().toString());
        numpaquete[6] = Integer.parseInt(numplancel.getText().toString());
        numpaquete[7] = Integer.parseInt(numpagoAgua.getText().toString());
        numpaquete[8] = Integer.parseInt(numpagoGas.getText().toString());
        numpaquete[9] = Integer.parseInt(numpagoInfonavit.getText().toString());
        numpaquete[10] = Integer.parseInt(numPagodiversion.getText().toString());


        Intent i = new Intent(MainActivity.this ,DatosPago.class );
        startActivity(i);
    }
});
    }
}

